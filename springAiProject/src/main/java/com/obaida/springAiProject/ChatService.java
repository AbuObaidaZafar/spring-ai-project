package com.obaida.springAiProject;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final OllamaChatModel chatModel;

    // Spring Boot will automatically inject the OllamaChatModel bean
    public ChatService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String generateText(String prompt) {
        try {
            // This calls your local Llama model
            return chatModel.call(prompt);
        } catch (Exception e) {
            return "Local AI Error: " + e.getMessage() +
                    ". Make sure Ollama is running and 'llama3.2' is pulled.";
        }
    }
}