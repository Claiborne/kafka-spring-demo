package com.claiborne.kafkarealdemo.repository;

import com.claiborne.kafkarealdemo.entiity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikiMediaData, Long> {
}
