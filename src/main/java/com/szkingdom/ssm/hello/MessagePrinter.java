package com.szkingdom.ssm.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tianf on 2016/8/9.
 */

@Component
public class MessagePrinter {
    final private MessageService service;
    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
