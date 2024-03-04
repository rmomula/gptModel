package com.genai.controller;

import com.genai.service.GPTService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/azureAI")
public class GPTController {

    private final GPTService gptService;

    public GPTController(GPTService gptService) {
        this.gptService = gptService;
    }

    @GetMapping("/rap/generate")
    public Mono<String> generateRapSong() {
        return gptService.generateRapSong();
    }
}
