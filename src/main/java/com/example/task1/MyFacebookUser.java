package com.example.task1;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyFacebookUser implements MyUser{
    
    public FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }
    @Override
    public String getEmail(){
        return facebookUser.getUserEmail();
    }

    @Override
    public String getCountry(){
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveDate(){
        return facebookUser.getLastActiveTime().toLocalDate();
    }
}
