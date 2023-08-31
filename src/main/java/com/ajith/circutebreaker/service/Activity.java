package com.ajith.circutebreaker.service;

import com.ajith.circutebreaker.dto.ActivityDto;
import com.ajith.circutebreaker.dto.ActivityMapper;
import com.ajith.circutebreaker.dto.ActivityResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
@Slf4j
public class Activity {
    @Autowired
    RestTemplate restTemplate;

    @CircuitBreaker(name = "activity", fallbackMethod = "fallBackMethod")
    public ActivityDto getActivity() {
        log.info("activity invoked");
        ResponseEntity<ActivityResponse> response = restTemplate.getForEntity("http://www.boredapi.com/api/activity/", ActivityResponse.class);
        log.info("successfully Invoked");
        return ActivityMapper.map(Objects.requireNonNull(response.getBody()));
    }

    public ActivityDto fallBackMethod(Throwable exception) {
        log.warn("fallBackMethod Invoked");
        return new ActivityDto("Watch movie", "entertainment");
    }
}