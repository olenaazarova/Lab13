package com.example.task1;
import com.example.task1.TwitterUser;
import java.time.LocalDate;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public class MyTwitterUser implements MyUser {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser)
    {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail(){
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry(){
        return twitterUser.getMyUserCountry();
    }

    @Override
    public LocalDate getLastActiveDate(){
        return twitterUser.getLastActiveTime().toLocalDate();
    }
}
