package com.example.sanyam.beacons;

import android.app.Application;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.MonitorNotifier;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.powersave.BackgroundPowerSaver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import retrofit2.Call;

/**
 * Created by sanyam on 29/12/16.
 */
public class MyApp extends Application implements BeaconConsumer {

    private static MyApp instance = null;
    public OnListRefreshListener onListRefreshListener;
    public MainActivity context;
    public CopyOnWriteArrayList<String> regionNameList;
    public HashMap<String,Region> ssnRegionMap;
    public CopyOnWriteArrayList<Region> regionList;
    private BeaconManager beaconManager;
    private static final Identifier nameSpaceId = Identifier.parse("0x5dc33487f02e477d4058");

    public interface OnListRefreshListener {
        void onListRefresh();
    }

    public static MyApp getInstance() {
        return instance;
    }

    public void setUpBeacon(){
        ssnRegionMap = new HashMap<>();
        regionList = new CopyOnWriteArrayList<>();
        regionNameList = new CopyOnWriteArrayList<>();

        ssnRegionMap.put("0x0117c59825E9",new Region("Beacona",nameSpaceId, Identifier.parse("0x0117c59825E9"),null));

        ssnRegionMap.put("SAME",new Region("Beaconb",nameSpaceId, Identifier.parse(""),null));


        ssnRegionMap.put("0x0117c59825E9",new Region("Beacon1",nameSpaceId, Identifier.parse("0x0117c59825E9"),null));
        ssnRegionMap.put("0x0117c55be3a8",new Region("Beacon2",nameSpaceId,Identifier.parse("0x0117c55be3a8"),null));
        ssnRegionMap.put("0x0117c552c493",new Region("Beacon3",nameSpaceId,Identifier.parse("0x0117c552c493"),null));
        ssnRegionMap.put("0x0117c55fc452",new Region("Beacon4",nameSpaceId,Identifier.parse("0x0117c55fc452"),null));
        ssnRegionMap.put("0x0117c555c65f",new Region("Beacon5",nameSpaceId,Identifier.parse("0x0117c555c65f"),null));
        ssnRegionMap.put("0x0117c55d6660",new Region("Beacon6",nameSpaceId,Identifier.parse("0x0117c55d6660"),null));
        ssnRegionMap.put("0x0117c55ec086",new Region("Beacon7",nameSpaceId,Identifier.parse("0x0117c55ec086"),null));

        beaconManager = BeaconManager.getInstanceForApplication(this);
        beaconManager.getBeaconParsers().add(new BeaconParser().
                setBeaconLayout(BeaconParser.EDDYSTONE_UID_LAYOUT));
        new BackgroundPowerSaver(this);
        beaconManager.bind(this);

    }

    @Override
    public void onBeaconServiceConnect() {
        beaconManager.addMonitorNotifier(new MonitorNotifier() {
            @Override
            public void didEnterRegion(Region region) {

            }

            @Override
            public void didExitRegion(Region region) {

            }

            @Override
            public void didDetermineStateForRegion(int i, Region region) {
                String regionName = region.getUniqueId();
                String beaconSSN = region.getId2().toHexString();
                switch (i) {
                    case INSIDE:
                        Log.i("TAG", "Enter " + regionName);
                        regionNameList.add(regionName);
                        regionList.add(region);
                        MyApp.notifyListChange();
                        Toast.makeText(getApplicationContext(), "Found beacon", Toast.LENGTH_SHORT).show();
                        //MyApp.showNotification("Found beacon");
                        //enterRegion(beaconSSN);
                        break;
                    case OUTSIDE:
                        Log.i("TAG", "Outside " + regionName);
                        if (regionNameList.contains(regionName)) {
                            regionNameList.remove(regionName);
                        }
                        if (regionList.contains(region)) {
                            regionList.remove(region);
                            MyApp.notifyListChange();
                        }
                        //exitRegion(beaconSSN);
                        //  MyApp.showNotification("Exit beacon");
                        // Toast.makeText(getApplicationContext(),"Exit beacon",Toast.LENGTH_SHORT).show();
                        break;
                }

                ArrayList<String> list_beaconSSN = new ArrayList<String>();
                for (Region r : regionList) {
                    list_beaconSSN.add(r.getId2().toHexString());
                }
                // ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------


                //updateUserInRegions(list_beaconSSN);

                // ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------// ---------------
                //-------------------

            }
        });


        try {
            for (String key : ssnRegionMap.keySet()) {
                Region region = ssnRegionMap.get(key);
                beaconManager.startMonitoringBeaconsInRegion(region);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }

    private static void notifyListChange(){
        if (instance.context != null && instance.onListRefreshListener != null) {
            instance.context.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    MyApp.instance.onListRefreshListener.onListRefresh();
                }
            });
        }
    }


}
