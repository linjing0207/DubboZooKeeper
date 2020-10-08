package com.linjing.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service //放到容器中
public class UserService {
    //想拿到provider-server提供的票, 需要去注册中心拿到服务
    @DubboReference //引用, pom坐标, 定义路径相同的接口名
        TicketService ticketService;

    public void buyTicket() {
        System.out.println("在注册中心拿到=>" + ticketService.getTicket());
    }
}
