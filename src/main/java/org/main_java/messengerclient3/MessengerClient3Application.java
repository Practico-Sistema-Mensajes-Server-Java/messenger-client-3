package org.main_java.messengerclient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MessengerClient3Application {

    public static void main(String[] args) {
        SpringApplication.run(MessengerClient3Application.class, args);
    }

}
