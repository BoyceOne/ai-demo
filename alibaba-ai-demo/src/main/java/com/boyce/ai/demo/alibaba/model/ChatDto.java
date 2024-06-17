package com.boyce.ai.demo.alibaba.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author by Boyce
 * @date 2024/6/17 10:09
 */
@Data
public class ChatDto implements Serializable {


    //{"chats":[{"role":"user","content":"dd"},{"role":"user","content":"dd"}]}

    private List<Msg> chats;

    @Data
    public static class Msg {

        private String role;

        private String content;
    }
}
