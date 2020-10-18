package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.mycompany.app")
@EnableSwagger2
@SuppressWarnings("PMD.UseUtilityClass")
public class HorseUserApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(HorseUserApplication.class, args);
    }
}
