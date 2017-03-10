package com.example.administrator.firebaselogsample;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Administrator on 3/10/2017.
 */

public class AppFb extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Facebook SDK stuff goes here
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

    }
}
