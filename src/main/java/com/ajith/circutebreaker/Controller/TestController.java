package com.ajith.circutebreaker.Controller;

import com.ajith.circutebreaker.dto.ActivityDto;
import com.ajith.circutebreaker.service.Activity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    @Autowired
  private final Activity activity;

    @GetMapping
    public ActivityDto activity(){
        return activity.getActivity();
    }
}
