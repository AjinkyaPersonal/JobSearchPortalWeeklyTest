package com.geekster.Job_Search_Portal_WeeklyTest.repo;

import com.geekster.Job_Search_Portal_WeeklyTest.model.Job;
import com.geekster.Job_Search_Portal_WeeklyTest.model.JobType;
import jakarta.annotation.Nullable;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobsRepo extends CrudRepository<Job, Long> {

    public List<Job> findByJobType(JobType jobType);

    public List<Job> findByTitleAndLocation(String title , String location);

    public List<Job> findBySalaryGreaterThan(Double salary);

    public List<Job> findByDescriptionOrLocation(String description , String location);

    public List<Job> findByCompanyName(String companyName);

    @Modifying
    @Query(value = "Delete from Jobs_Data_Base where Company_Name = :companyName " , nativeQuery = true)
    public void deleteByCompanyName(String companyName);

    @Modifying
    @Query(value = "update Jobs_Data_Base set salary = :jobSalary where id = :job_Id" , nativeQuery = true)
    public void updateSalaryBasedOnId(Long job_Id , Double jobSalary);

    @Query(value = "Select * from Jobs_Data_Base where job_type = :jobType"  , nativeQuery = true)
    public List<Job> getJobsByJobType(String jobType);

    @Query(value = "Select * from Jobs_Data_Base where salary >= :jobSalary" , nativeQuery = true)
    public List<Job> getJobsBySalary(Double jobSalary);






}
