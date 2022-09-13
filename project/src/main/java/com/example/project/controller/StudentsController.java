package com.example.project.controller;

import com.example.project.entity.RespInfo;
import com.example.project.entity.Students;
import com.example.project.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;
    @RequestMapping("/findAll")
    public RespInfo findAll(){
        List<Students> list =studentsService.findAll();
        System.out.println(list);
        RespInfo respInfo=new RespInfo();
        respInfo.setCode(1);
        respInfo.setMsg("获取数据成功");
        respInfo.setData(list);
        return respInfo;
    }
}
