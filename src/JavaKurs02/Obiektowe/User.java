package JavaKurs02.Obiektowe;

public class User {
    public String userName;
    public String password;

    public User(){
        System.out.println("Hello kontruktor bez parametrów");
    }

    public User(String userName, String password){
        System.out.println("Hello kontruktor z parametrami");
        this.userName = userName;
        this.password = password;

    }


    public void sayHello(){
        System.out.println("Hello my name is "+ userName);
    }
}
