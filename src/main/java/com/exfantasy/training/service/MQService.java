package com.exfantasy.training.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQService {

    @JmsListener(destination = "portal.admin.topic",containerFactory = "jmsListenerContainerTopic") // 监听指定消息主题
    public void receiveTopic(String message) {
        System.out.println(message);
    }

    @JmsListener(destination = "portal.admin.queue",containerFactory = "jmsListenerContainerQueue") // 监听指定消息主题
    public void receiveQueue(String message) {
        System.out.println(message);
    }
}