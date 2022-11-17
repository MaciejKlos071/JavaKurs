package JavaKurs02.HomeWork.Dziedziczenie;

public class AppChecker {
    public static void main(String[] args) {
        AndroidApp androidApp = new AndroidApp("Facebook");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("TikTok");
        iphoneApp.appInfo();
        iphoneApp.runIphohneApp();


    }




}
