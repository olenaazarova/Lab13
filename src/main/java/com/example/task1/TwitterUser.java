package com.example.task1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;
@Data

public class TwitterUser {
    private String UserMail;
    private String MyUserCountry;
    private LocalDateTime LastActiveTime;

    public String getUserMail() {
        return UserMail;
    }
    public String getMyUserCountry() {
        return MyUserCountry;
    }
    public LocalDateTime getLastActiveTime() {
        return LastActiveTime;
    }
    
    // public static void main(String[] args) {
    //     System.out.println("Hello world!");
    // }
}