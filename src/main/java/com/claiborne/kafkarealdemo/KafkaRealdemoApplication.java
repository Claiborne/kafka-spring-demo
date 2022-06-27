package com.claiborne.kafkarealdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaRealdemoApplication implements CommandLineRunner {

	WikimediaChangesProducer wikimediaChangesProducer;

	public KafkaRealdemoApplication(WikimediaChangesProducer wikimediaChangesProducer) {
		this.wikimediaChangesProducer = wikimediaChangesProducer;
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaRealdemoApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
		wikimediaChangesProducer.sendMessage();
	}
}
