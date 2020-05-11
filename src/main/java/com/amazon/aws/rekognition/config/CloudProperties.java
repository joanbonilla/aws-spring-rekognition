package com.amazon.aws.rekognition.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("aws")
public class CloudProperties {

    private String accessKey;

    private String secretKey;
}