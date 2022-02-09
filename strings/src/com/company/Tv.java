package com.company;

public interface Tv {
    void turnOnTv();
    void turnOffTv();
    void turnVolumeDown();
    void turnVolumeUp();
    void switchChannels();

}
interface SmartTR extends TvRemote{
    void wifiConnectionSetting();
    void browsingApps();

}
class SmartTvR implements SmartTvRemote{
    public void tv() {
        System.out.println("class tv methods  in class define");
        }
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
        public static void wifiConnectionSetting(){
            System.out.println("wifi connections");
        }
        public static void browsingApps(){
            System.out.println("browsing Apps ");
        }
    }
