package com.qf.rbac.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "config.sms")
@Data
public class SmsConfig {

    private String accessKeyId;
    private String accessSecret;
    private String signName;
    private String regionId;
}
