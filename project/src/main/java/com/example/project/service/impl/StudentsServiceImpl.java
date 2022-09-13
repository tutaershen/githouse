package com.example.project.service.impl;

import com.example.project.entity.Students;
import com.example.project.mapper.StudentsMapper;
import com.example.project.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;
    @Override
    public List<Students> findAll() {
        List<Students> list=studentsMapper.findAll();
        return list;
    }
}
