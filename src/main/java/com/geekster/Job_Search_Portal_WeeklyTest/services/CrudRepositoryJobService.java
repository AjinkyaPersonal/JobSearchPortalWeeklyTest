package com.geekster.Job_Search_Portal_WeeklyTest.services;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.repo.IJobsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class CrudRepositoryJobService {

    @Autowired
    IJobsRepo jobsRepo;
    public String addJobs(List<Job> jobList) {
        Iterable<Job> list_of_jobs = jobsRepo.saveAll(jobList);

        if(list_of_jobs==null){
            return "Jobs not added successfully";
        }

        return "Jobs added successfully";

    }

    public Iterable<Job> getAllJobs() {
        return jobsRepo.findAll();
    }

    public String deleteById(String jobId) {
        long job_Id = Long.parseLong(jobId);

        Optional<Job> list = jobsRepo.findById(job_Id);

        if(!(list.isEmpty())){
            jobsRepo.deleteById(job_Id);
            return "Job with job_Id "+jobId + " deleted successfully";
        }else{
            return "Job with job_Id "+jobId + " not found";
        }

    }

    public String updateById(Job job , String jobId) {
        long job_Id = Long.parseLong(jobId);

        Optional<Job> list = jobsRepo.findById(job_Id);

        if(!(list.isEmpty())){
            job.setId(job_Id);
            jobsRepo.save(job);

            return "Job with job_Id "+jobId + " updated successfully";
        }else{
            return "Job with job_Id "+jobId + " not found";
        }
    }
}
