package com.example.visapenaltyfeecalculation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Scheduler {
    @Autowired
    private CacheManager cacheManager;

    @Scheduled(fixedDelay = 20 * 60 * 1000) // Running after 20 minutes
    public void clear() {
        cacheManager.getCache("currency").clear();
    }
}
