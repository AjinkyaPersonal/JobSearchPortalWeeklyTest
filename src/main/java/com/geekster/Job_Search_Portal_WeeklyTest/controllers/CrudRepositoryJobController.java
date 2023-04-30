package com.geekster.Job_Search_Portal_WeeklyTest.controllers;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.services.CrudRepositoryJobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "CRJ")
public class CrudRepositoryJobController {

    @Autowired
    CrudRepositoryJobService crudRepositoryJobService;

    @PostMapping(value = "jobs")
    public String addJobs( @Valid @RequestBody List<Job> jobList){
        return crudRepositoryJobService.addJobs(jobList);
    }

    @GetMapping(value = "jobs")
    public Iterable<Job> getAllJobs(){
        return crudRepositoryJobService.getAllJobs();
    }

    @DeleteMapping(value = "jobs/{jobId}")
    public String deleteById(@PathVariable String jobId){
        return crudRepositoryJobService.deleteById(jobId);
    }

    @PutMapping(value = "jobs/{jobId}")
    public String updateById(@Valid @RequestBody Job job , @PathVariable String jobId){
        return crudRepositoryJobService.updateById(job , jobId);
    }
}
