package HomeWork.HomeWork_7;

public class App {
    public String name;
    public String version;
    public String producent;
        public App(String name, String version, String producent){
            this.name = name;
            this.version = version;
            this.producent = producent;
        }
        public void appInfo(){

            System.out.println("Name: "+ name);
            System.out.println("Model: "+ version);
            System.out.println("Serial Number: "+ producent);
        }
}
