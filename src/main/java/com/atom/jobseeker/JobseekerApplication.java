package com.atom.jobseeker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author wayan
 */
@SpringBootApplication
public class JobseekerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobseekerApplication.class, args);
    }
}
