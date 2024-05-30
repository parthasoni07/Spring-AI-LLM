package com.ai.ai.controller;

import org.springframework.ai.stabilityai.StabilityAiImageClient;
import org.springframework.ai.stabilityai.api.StabilityAiApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StabilityAiConfig {
	@Value("${spring.ai.stabilityai.api-key}")
    private StabilityAiApi apiKey;

    @Bean
    public StabilityAiImageClient stabilityAiImageClient() {
        return new StabilityAiImageClient(apiKey);
    }
}
