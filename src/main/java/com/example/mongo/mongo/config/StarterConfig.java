package com.example.mongo.mongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = com.profiler.profilerartifact.config.Config.class)
public class StarterConfig {
}
