package com.profiles.profiles;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(
        prefix = "currency-service"
)
@Data
@Component
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;

}
