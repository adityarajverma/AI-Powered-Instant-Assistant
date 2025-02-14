package com.instant_assistant.controller;


import com.instant_assistant.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/")
public class InstantAssistantChatController {


    @Autowired
    private ChatService chatService;

    @GetMapping("/chat/")
    public ResponseEntity getChatResponse(@RequestParam(name ="inputText") String inputText) throws IOException {
        return  ResponseEntity.ok(chatService.getResponse(inputText));

    }



}
