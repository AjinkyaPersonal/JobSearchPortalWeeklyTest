package com.geekster.Job_Search_Portal_WeeklyTest.services;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.model.JobType;
import com.geekster.Job_Search_Portal_WeeklyTest.repo.IJobsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomQueryJobService {
    @Autowired
    IJobsRepo jobsRepo;

    @Transactional
    public String deleteByCompanyName(String companyName) {
        List<Job> list = jobsRepo.findByCompanyName(companyName);

        if(list!=null){
            jobsRepo.deleteByCompanyName(companyName);
            return "Job with job_Id "+ companyName + " deleted successfully";
        }else{
            return "Job with job_Id "+companyName + " not found";
        }
    }

    @Transactional
    public String updateSalaryBasedOnId(String jobId , String jobSalary ){
        Long job_Id = Long.parseLong(jobId);

        Double job_Salary = Double.parseDouble(jobSalary);

        Optional<Job> list = jobsRepo.findById(job_Id);

        if(!(list.isEmpty())){
            jobsRepo.updateSalaryBasedOnId(job_Id , job_Salary);
            return "Job with job_Id "+jobId + " updated successfully";
        }else{
            return "Job with job_Id "+jobId + " not found";
        }

    }

    public List<Job> getJobsBySalary(String salary){
        Double job_Salary = Double.parseDouble(salary);

        return jobsRepo.getJobsBySalary(job_Salary);
    }

    public List<Job> getJobsByJobType(JobType jobType){
        String job_type = jobType.toString();
        return jobsRepo.getJobsByJobType(job_type);
    }
}
