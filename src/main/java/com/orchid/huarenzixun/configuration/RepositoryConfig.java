package com.orchid.huarenzixun.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.orchid.huarenzixun.repository"})
public class RepositoryConfig {
}
