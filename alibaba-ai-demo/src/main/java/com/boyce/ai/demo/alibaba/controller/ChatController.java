package com.boyce.ai.demo.alibaba.controller;

import com.boyce.ai.demo.alibaba.model.ChatDto;
import com.boyce.ai.demo.alibaba.service.ChatService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author by Boyce
 * @date 2024/6/17 09:34
 */
@RestController
@RequestMapping("/chat")
@CrossOrigin
@AllArgsConstructor
@Slf4j
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/simple")
    public ChatDto.Msg completion(@RequestBody ChatDto.Msg msg) {

        String res = chatService.completion(msg.getContent());
        ChatDto.Msg rntMsg = new ChatDto.Msg();
        rntMsg.setContent(res);
        rntMsg.setRole("rr");

        return rntMsg;
    }
}
