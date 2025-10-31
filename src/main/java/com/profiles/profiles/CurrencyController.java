package com.profiles.profiles;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class CurrencyController {
    private final CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getCurrencyServiceConfiguration() {
        return configuration;
    }
}
