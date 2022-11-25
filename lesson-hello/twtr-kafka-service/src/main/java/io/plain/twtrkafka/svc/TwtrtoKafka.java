package io.plain.twtrkafka.svc;

import io.plain.twtrkafka.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = "io.plain.twtrkafka")
public class TwtrtoKafka implements CommandLineRunner {
    @Autowired
    AppConfig appConfig;
    public static void main(String[] args) {
        SpringApplication.run(TwtrtoKafka.class);
    }
    @PostConstruct
    public void init()
    {

    }

//    @Override
    public void onApplicationEvent(ApplicationEvent event) {

    }

    @Override
    public void run(String... args) throws Exception {
        log.info("values passed .." + appConfig.getTwtrSearchKeywords());
        log.info("Startup Message" + appConfig.getStartupMessage());

    }
}
