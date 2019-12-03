package io.migenjutsu.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import io.migenjutsu.project.dependencyinjection.services.NameFactory;
import io.migenjutsu.project.dependencyinjection.services.NameService;

@Configuration
public class NameConfig {
    @Bean
    public NameFactory nameFactory() {
        return new NameFactory();
    }

    @Bean(name = "subaru")
    @Primary
    public NameService nameServiceSubaruImpl(NameFactory factory) {
        return factory.createNameService("su");
    }

    @Bean("acura")
    public NameService nameServiceAcuraImpl(NameFactory factory) {
        return factory.createNameService("ac");
    }

    @Bean(name = "tesla")
    public NameService nameServiceTeslaImpl(NameFactory factory) {
        return factory.createNameService("te");
    }
}

    // @Bean
    // public NameFactory nameFactory() {
    //     return new NameFactory();
    // }

    // @Bean(name = "subaru")
    // // @Profile("subaru")
    // @Primary
    // public NameService nameServiceSubaruImpl(NameFactory factory) {
    //     return factory.createNameService("su");
    // }

    // @Bean(name = "acura")
    // // @Profile("acura")
    // public NameService nameServiceAcuraImpl(NameFactory factory) {
    //     return factory.createNameService("ac");
    // }

    // @Bean(name = "tesla")
    // public NameService nameServiceTeslaImpl(NameFactory factory) {
    //     return factory.createNameService("te");
    // }