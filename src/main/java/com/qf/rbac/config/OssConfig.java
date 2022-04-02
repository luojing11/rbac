package com.qf.rbac.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "config.oss")
public class OssConfig {

   private String endpoint;
   private String keyid;
   private String keysecret;
   private String bucketname;

}
