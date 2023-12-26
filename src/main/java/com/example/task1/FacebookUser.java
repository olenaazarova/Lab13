package com.example.task1;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter

public class FacebookUser{
    private String userEmail;
    private String userCountry;
    private LocalDateTime userActiveTime;


    public String getUserEmail() {
        return userEmail;
    }
    public String getUserCountry() {
        return userCountry;
    }
    public LocalDateTime getLastActiveTime() {
        return userActiveTime;
    }
}