package com.simplify.studySpringBoot.service;

import com.simplify.studySpringBoot.entity.Sample;
import com.simplify.studySpringBoot.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public List<Sample> getSamples() {
        return sampleRepository.findAll();
    }

    public Sample addSample(String name){
        return sampleRepository.save(Sample.builder().name(name).build());
    }
}
