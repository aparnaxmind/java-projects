package com.company;

 interface TvRemote {

    public static void turnOnTv(){
        System.out.println(" turn on TV");
    }
    public static void turnOffTv(){
        System.out.println(" turn off TV ");
    }
    public static void turnVolumeDown(){
        System.out.println(" turn volume down ");
    }
    public static void turnVolumeUp(){
        System.out.println(" turn volume up ");
    }
    public static void switchChannels() {
        System.out.println(" switch channels ");
    }
}
 interface SmartTvRemote extends TvRemote{
     public static void wifiConnectionSetting(){
         System.out.println("wifi connections");
     }
     public static void browsingApps(){
         System.out.println("browsing Apps ");
     }
}
class SmartTv implements SmartTvRemote{
    public void tv() {
        System.out.println("class tv");
        TvRemote.turnOnTv();
        TvRemote.turnOffTv();
        TvRemote.turnVolumeDown();
        TvRemote.turnVolumeUp();
        TvRemote.switchChannels();
        SmartTvRemote.wifiConnectionSetting();
        SmartTvRemote.browsingApps();
}}


