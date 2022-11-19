package JavaKurs02.ModyfikatoryDostepu.first;

public class Parent {

    public String first = "public";
    String secound  = "defoult";
    protected String third = "protected";
    private String fourth = "Private";

    public void firstmetod(){
        System.out.println("Public");
    }
    void secoundmetod(){
        System.out.println("defoult");
    }
    protected void thirdmetod(){
        System.out.println("Third - protected");
    }
    private void fourthmetod(){
        System.out.println("Fourth - private");
    }
    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(secound);
        System.out.println(third);
        System.out.println(fourth);
        firstmetod();
        secoundmetod();
        thirdmetod();
        fourthmetod();
    }
}
