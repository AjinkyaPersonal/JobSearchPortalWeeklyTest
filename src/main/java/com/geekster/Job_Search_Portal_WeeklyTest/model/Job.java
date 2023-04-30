package com.geekster.Job_Search_Portal_WeeklyTest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Jobs_Data_Base")
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Length(min = 4, max = 255, message = "Title length should be between 4 and 255")
    @Column(name = "description" , length = 255)
    private String description;

    private String location;

    @Column(name = "salary" , nullable = false)
    private Double salary;

    @NotEmpty
    @Column(name = "Company_Name" , unique = true )
    private String companyName;

    @NotEmpty
    @Column(name = "Employer_Name" , nullable = false)
    private String employerName;
//    private <Some-Enum> jobType;
    @Enumerated(EnumType.STRING) //only for watching strings in DB.
    private JobType jobType;


    @Column(name = "Applied_Date" )
    @NotNull
    private LocalDate appliedDate;
}
