package com.example.providerticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String getTicket(){
        System.out.println("我是8001");
        return "《厉害了，我的国》";
    }
}
