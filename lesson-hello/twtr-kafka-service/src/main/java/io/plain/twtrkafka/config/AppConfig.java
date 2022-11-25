package io.plain.twtrkafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Data
@Configuration
@ConfigurationProperties(prefix = "twtr-to-kafka-svc")
public class AppConfig {
    private List<String> twtrSearchKeywords;
    private String startupMessage;
}
