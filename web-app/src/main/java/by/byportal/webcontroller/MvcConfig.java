package by.byportal.webcontroller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers (ViewControllerRegistry registry){
        registry.addViewController("/StartPage").setViewName("StartPage");
        registry.addViewController("/Rules").setViewName("Rules");
        registry.addViewController("/LoginPage").setViewName("LoginPage");
        registry.addViewController("/").setViewName("Home");
        registry.addViewController("/Bye").setViewName("Bye");

    }
}
