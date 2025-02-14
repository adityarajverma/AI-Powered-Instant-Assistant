package com.instant_assistant.service;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ChatService {

    @Value("classpath:/prompt/system.txt")
    private Resource resource;

    @Autowired
    private ChatClient chatClient;


    public String getResponse(String request) throws IOException {
        return this.chatClient.prompt().system(resource.getInputStream().toString())
                .user(request).call().content();


    }


}
