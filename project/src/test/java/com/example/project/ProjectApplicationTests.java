package com.example.project;

import com.example.project.entity.Students;
import com.example.project.mapper.StudentsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    private StudentsMapper studentsMapper;

    @Test
    void contextLoads() {
        List<Students>  list = studentsMapper.findAll();
        System.out.println(list);

    }

}
