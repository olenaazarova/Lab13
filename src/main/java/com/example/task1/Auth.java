package com.example.task1;

public class Auth {
    public MyUser login() {
        int n = 0;
        if (n > 0) {
            return new MyTwitterUser(new TwitterUser());
        } else {
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void processData(MyUser myUser){
        String country = myUser.getCountry();
    }
}