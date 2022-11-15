package JavaKurs02.Obiektowe;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.userName = "Maciej";
        user.password = "qwerty";
        user.sayHello();

        User user2 = new User("Maciej","asd");
        System.out.println(user2.userName);
        System.out.println(user2.password);
    }
}
