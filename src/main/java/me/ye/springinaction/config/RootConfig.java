package me.ye.springinaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Jacob
 * @date 12/04/2018
 */

@Configuration
@ComponentScan(basePackages = {"me.ye.springinaction"},
    excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
    })
public class RootConfig {
}
