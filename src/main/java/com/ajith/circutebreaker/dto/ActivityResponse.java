package com.ajith.circutebreaker.dto;

import lombok.Data;

@Data
public class ActivityResponse {
    private String activity;
    private String type;
    private Integer participants;
    private Double price;
    private String link;
    private String key;
    private Double accessibility;

}
