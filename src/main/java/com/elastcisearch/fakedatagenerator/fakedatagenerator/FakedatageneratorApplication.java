package com.elastcisearch.fakedatagenerator.fakedatagenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakedatageneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FakedatageneratorApplication.class, args);
        ElasticSearchFakeDataGenerator elasticSearchFakeDataGenerator = new ElasticSearchFakeDataGenerator();
        elasticSearchFakeDataGenerator.generateFakeDataFile();
    }

}

