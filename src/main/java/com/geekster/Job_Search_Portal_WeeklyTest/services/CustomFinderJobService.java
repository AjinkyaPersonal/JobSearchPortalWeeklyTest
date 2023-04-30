package com.geekster.Job_Search_Portal_WeeklyTest.services;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.model.JobType;
import com.geekster.Job_Search_Portal_WeeklyTest.repo.IJobsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomFinderJobService {

    @Autowired
    IJobsRepo jobsRepo;

    public List<Job> getByJobType(JobType job_type) {
        return jobsRepo.findByJobType(job_type);
    }

    public List<Job> getByTitleAndLocation(String title, String location) {
        return jobsRepo.findByTitleAndLocation(title , location);
    }

    public List<Job> getBySalary(String salary) {
        Double job_salary = Double.parseDouble(salary);

        return jobsRepo.findBySalaryGreaterThan(job_salary);
    }

    public List<Job> getByDescriptionOrLocation(String description, String location) {
        return jobsRepo.findByDescriptionOrLocation(description , location);
    }
}
