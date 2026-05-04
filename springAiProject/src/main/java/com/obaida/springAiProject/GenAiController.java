package com.obaida.springAiProject;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class GenAiController {

    private final ChatService chatService;

    public GenAiController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/generate")
    public String generateText(@RequestBody Map<String, String> payload) {
        String prompt = payload.get("prompt");
        return chatService.generateText(prompt);
    }
}
