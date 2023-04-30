package com.geekster.Job_Search_Portal_WeeklyTest.controllers;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.model.JobType;
import com.geekster.Job_Search_Portal_WeeklyTest.services.CustomFinderJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "CFJ")
@RestController
public class CustomFinderJobController {

    @Autowired
    CustomFinderJobService customFinderJobService;

    @GetMapping(value = "jobs/jobType")
    public List<Job> getByJobType(@RequestParam JobType jobType){
        return customFinderJobService.getByJobType(jobType);
    }

    @GetMapping(value = "jobs/title/location")
    public List<Job> getByTitleAndLocation(@RequestParam String title , @RequestParam String location){
        return customFinderJobService.getByTitleAndLocation(title , location);
    }



    @GetMapping(value = "jobs/salary")
    public List<Job> getBySalary(@RequestParam String salary){
        return customFinderJobService.getBySalary(salary);
    }

    @GetMapping(value = "jobs/description/location")
    public List<Job> getByDescriptionOrLocation(@RequestParam String description , @RequestParam String location){
        return customFinderJobService.getByDescriptionOrLocation(description , location);
    }

}
