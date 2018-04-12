package com.example.bonus.p;


/**
 * Created by BONUS on 12.04.2018.
 */

public class MyApplication extends MainActivity {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
