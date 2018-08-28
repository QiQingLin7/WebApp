package com.webapp;

import com.webapp.util.GetIP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebAppApplication {
    public static void main(String[] args) {
        GetIP getIP = new GetIP();
        String publicip = getIP.publicip();
        SpringApplication.run(WebAppApplication.class, args);
        System.out.println(publicip);
    }

}
