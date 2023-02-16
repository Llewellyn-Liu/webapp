package com.lrl.liustationspring;

import com.lrl.liustationspring.service.Bootstrapper;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiuStationSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuStationSpringApplication.class, args);

        Bootstrapper.bootstrap();
    }

}
