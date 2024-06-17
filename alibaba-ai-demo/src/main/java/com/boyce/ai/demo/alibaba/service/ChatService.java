package com.boyce.ai.demo.alibaba.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

/**
 * @author by Boyce
 * @date 2024/6/17 09:38
 */
@Slf4j
@Service
@AllArgsConstructor
public class ChatService {


    private final ChatClient chatClient;

    public String completion(String message) {

        Prompt prompt = new Prompt(new UserMessage(message));

        return chatClient.call(prompt).getResult().getOutput().getContent();
    }
}
