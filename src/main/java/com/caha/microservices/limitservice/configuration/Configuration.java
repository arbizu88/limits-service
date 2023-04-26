package com.caha.microservices.limitservice.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {
    private int minimum;
    private int maximum;
}
