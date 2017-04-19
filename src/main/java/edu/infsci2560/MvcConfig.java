package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/balls").setViewName("balls");
        registry.addViewController("/overgrips").setViewName("overgrips");
        registry.addViewController("/rackets").setViewName("rackets");
        registry.addViewController("/replacementgrips").setViewName("replacementgrips");
        registry.addViewController("/shoes").setViewName("shoes");
        registry.addViewController("/strings").setViewName("strings");
    }

}