package com.linjing.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

//ZooKeeper服务注册与发现
@DubboService //可以被扫描到, 在项目启动就自动注册到注册中心
@Component //这里使用了Dubbo后, 尽量不要用service注解
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "李荣浩演唱会门票";
    }
}
