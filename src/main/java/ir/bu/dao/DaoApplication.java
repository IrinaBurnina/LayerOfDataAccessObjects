package ir.bu.dao;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoApplication {
    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(CommandLineRunner.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
        SpringApplication.run(DaoApplication.class, args);}
}
