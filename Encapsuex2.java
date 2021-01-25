public class Encapsuex2
{
    private String fname = "Amit";
    private String lname = "Kumar";
    private String email = "john@doe.com";
    private int age = 24;

    public static void main(String[] args)
    {
        Encapsuex2 obj1 = new Encapsuex2();
        System.out.println("Name: " + obj1.fname +" " + obj1.lname);
        System.out.println("Email Id : " + obj1.email);
        System.out.println("Age: " + obj1.age);
    }
}