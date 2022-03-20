package HomeWork.HomeWork_7;

public class AndroidApp extends App{
    static String browserApp = "Chrome";

    public AndroidApp(String name, String version, String producent) {
        super(name, version, producent);

    }
    public void runAndroidApp(){
        System.out.println("_____Android app on !_____");
    }

    public void androidInfo(){
        appInfo();
        System.out.println("Browser: "+ browserApp);
    }
}

