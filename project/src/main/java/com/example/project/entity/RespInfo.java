package com.example.project.entity;

import lombok.Data;

//响应数据的格式
@Data
public class RespInfo {
    private Integer code;//请求码
    private String msg;//服务器响应的消息
    private Object data;//服务器响应的数据
}
