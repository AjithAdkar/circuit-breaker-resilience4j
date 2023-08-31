package com.ajith.circutebreaker.dto;

public class ActivityMapper {
    public static ActivityDto map(ActivityResponse response){
       return new ActivityDto(response.getActivity(), response.getType());
    }
}
