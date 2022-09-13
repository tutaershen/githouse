package com.example.project.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Students implements Serializable {
    private Integer stuId;
    private String stuName;
    private String password;
    private String stuGrade;
    private Integer majorId;
    private Integer delMark;


}


