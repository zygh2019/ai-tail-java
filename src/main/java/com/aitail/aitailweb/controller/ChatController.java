package com.aitail.aitailweb.controller;

import com.aitail.aitailweb.common.YiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author liushengbin
 * @date 2023/3/29
 */
@RestController
@RequestMapping("/chat")
public class ChatController {
    @RequestMapping("/pushMsg")
    public YiResponse pushSend(String msg) {
        HashMap hashMap = new HashMap();
        hashMap.put("msg", "我回复开始了");
        hashMap.put("my", "false");
        return YiResponse.success(hashMap);
    }


}
