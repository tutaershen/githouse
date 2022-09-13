package com.example.project.mapper;

import com.example.project.entity.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentsMapper {
    //查找所有的学生
    List<Students> findAll();
}
