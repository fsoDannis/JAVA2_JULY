package com.dannis.java2_july;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
 
import android.app.Application;
 
public class ParseApplication extends Application {
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        // Add your initialization code here
        Parse.initialize(this, "kp5gk2ND5TpwDbmJPM26POGNqkmHegzKKFfH1rDM", "7Sr6ETRsCi6Q5z7gexAE6OHtaywJCFfSNcXMssrM");
 
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
 
        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);
 
        ParseACL.setDefaultACL(defaultACL, true);
    }
 
}