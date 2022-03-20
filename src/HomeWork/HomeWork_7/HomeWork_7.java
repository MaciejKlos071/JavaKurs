package HomeWork.HomeWork_7;

public class HomeWork_7 {
    public static void main(String[] args) {
        AndroidApp androidApp001 = new AndroidApp("FaceBook", "1.0.15.6v", "Meta");
        androidApp001.runAndroidApp();
        androidApp001.androidInfo();

        IphoneApp iphoneApp001 = new IphoneApp("FaceBook", "1.1.1.6v", "Meta");
        iphoneApp001.runIphoneApp();
        iphoneApp001.iphoneInfo();
    }
}
