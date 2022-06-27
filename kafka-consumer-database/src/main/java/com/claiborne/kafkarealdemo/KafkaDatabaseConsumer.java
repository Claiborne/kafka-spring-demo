package com.claiborne.kafkarealdemo;

import com.claiborne.kafkarealdemo.entiity.WikiMediaData;
import com.claiborne.kafkarealdemo.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

  private static final Logger Log = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

  private WikimediaDataRepository wikimediaDataRepository;

  public KafkaDatabaseConsumer(WikimediaDataRepository wikimediaDataRepository) {
    this.wikimediaDataRepository = wikimediaDataRepository;
  }

  @KafkaListener(topics = "wikimedia_recent_change", groupId = "wikiGroup")
  public void consume(String eventMessage) {
    Log.info(String.format("Message received - %s", eventMessage));

    WikiMediaData wikiMediaData = new WikiMediaData();
    wikiMediaData.setWikiEventData(eventMessage);

    wikimediaDataRepository.save(wikiMediaData);
  }

}
