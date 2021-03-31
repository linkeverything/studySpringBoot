package com.simplify.studySpringBoot.controller;

import com.simplify.studySpringBoot.entity.Sample;
import com.simplify.studySpringBoot.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping(value = "/samples")
    public List<Sample> getSamples(){
        return sampleService.getSamples();
    }

    @PostMapping(value = "/samples")
    public Sample addSample(String name){
        return sampleService.addSample(name);
    }
}
