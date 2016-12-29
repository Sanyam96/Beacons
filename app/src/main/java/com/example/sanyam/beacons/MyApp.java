package com.example.sanyam.beacons;

import android.app.Application;

import org.altbeacon.beacon.BeaconConsumer;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by sanyam on 29/12/16.
 */
public class MyApp extends Application implements BeaconConsumer {

    private static MyApp instance = null;
    public OnListRefreshListener onListRefreshListener;
    public MainActivity context;
    public CopyOnWriteArrayList<String> regionNameList;

    public interface OnListRefreshListener {
        void onListRefresh();
    }

    public static MyApp getInstance() {
        return instance;
    }

    public void onBeaconServiceConnect(){}


}
