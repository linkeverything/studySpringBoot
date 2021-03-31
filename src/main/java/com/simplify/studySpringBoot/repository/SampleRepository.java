package com.simplify.studySpringBoot.repository;

import com.simplify.studySpringBoot.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {

}
