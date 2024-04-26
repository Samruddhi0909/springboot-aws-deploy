package com.example.test.url;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class SchedulerService {
	
	private final RestTemplate restTemplate;

    public SchedulerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    //@Scheduled(cron = "5 * * * * ?") // Run every 30 seconds
    //public void callHelloWorldApi() {
    	//logger.info("Executing callHelloWorldApi method...");
        //String apiUrl = "http://localhost:8080/hello"; // Change the URL if needed
        //String result = restTemplate.getForObject(apiUrl, String.class);
        //System.out.println("API Response: " + result);
        //logger.info("callHelloWorldApi method executed.")

        @Scheduled(fixedRate = 5000) // Run every 5 seconds
        public void callHelloWorldApi() {
            String apiUrl = "http://localhost:8080/hello"; // Change the URL if needed
            String result = restTemplate.getForObject(apiUrl, String.class);
            System.out.println("API Response: " + result);
    }

}
