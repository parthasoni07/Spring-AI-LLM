package com.ai.ai.controller;

import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ai.ai.service.StabilityAiImageService;

@RestController
@RequestMapping("/api/images")
public class ChatController {
	
	@Autowired
	private  StabilityAiImageService stabilityAiImageService;

//    @Autowired
//    public ImageController(StabilityAiImageService stabilityAiImageService) {
//        this.stabilityAiImageService = stabilityAiImageService;
//    }
	


    @GetMapping("/generate-image")
    public ImageResponse generateImage(@RequestParam String prompt,
                                       @RequestParam(defaultValue = "cinematic") String stylePreset,
                                       @RequestParam(defaultValue = "1024") int height,
                                       @RequestParam(defaultValue = "1024") int width) {
        return stabilityAiImageService.generateImage(prompt, stylePreset, height, width);
    }
}

