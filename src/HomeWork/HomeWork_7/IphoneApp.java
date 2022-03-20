package HomeWork.HomeWork_7;

public class IphoneApp extends App{
    static String browserApp = "Safari";
    public IphoneApp(String name, String version, String producent) {
        super(name, version, producent);
    }
    public void runIphoneApp(){
        System.out.println("_____Apple app ON !_____");
    }
    public void iphoneInfo(){
        appInfo();
        System.out.println("Browser: "+ browserApp);
    }

}
