package com.ai.ai.service;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.stabilityai.StabilityAiImageClient;
import org.springframework.ai.stabilityai.api.StabilityAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StabilityAiImageService {

	private final StabilityAiImageClient stabilityAiImageClient;

    @Autowired
    public StabilityAiImageService(StabilityAiImageClient stabilityAiImageClient) {
        this.stabilityAiImageClient = stabilityAiImageClient;
    }

    public ImageResponse generateImage(String prompt, String stylePreset, int height, int width) {
        ImagePrompt imagePrompt = new ImagePrompt(prompt);
        StabilityAiImageOptions options = StabilityAiImageOptions.builder()
                .withStylePreset(stylePreset)
                .withHeight(height)
                .withWidth(width)
                .build();

        // Modify this call to pass only the ImagePrompt
        return stabilityAiImageClient.call(imagePrompt);
    }
}

