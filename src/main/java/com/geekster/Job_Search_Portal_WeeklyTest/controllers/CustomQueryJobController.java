package com.geekster.Job_Search_Portal_WeeklyTest.controllers;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.model.JobType;
import com.geekster.Job_Search_Portal_WeeklyTest.services.CustomQueryJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "CQJ")
public class CustomQueryJobController {

    @Autowired
    CustomQueryJobService customQueryJobService;

    @DeleteMapping(value = "jobs/{companyName}")
    public String deleteByCompanyName(@PathVariable String companyName){
        return customQueryJobService.deleteByCompanyName(companyName);
    }

    @PutMapping(value = "jobs/{id}/{salary}")
    public String updateSalaryById(@PathVariable String id , @PathVariable String salary){
        return customQueryJobService.updateSalaryBasedOnId(id , salary);
    }

    @GetMapping(value = "jobs/{salary}")
    public List<Job> getJobsBySalary(@PathVariable String salary){
        return customQueryJobService.getJobsBySalary(salary);
    }

    @GetMapping(value = "jobs/JobType/{jobType}")
    public List<Job> getJobsByJobType(@PathVariable JobType jobType){
        return customQueryJobService.getJobsByJobType(jobType);
    }


}
