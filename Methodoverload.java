//method overloading example
public class Methodoverload
{
    static int plusmethod(int x, int y)
    {
        return x + y;
    }
    static double plusmethod(double x, double y)
    {
        return x + y;
    }

    public static void main(String[] args)
    {
        int num1 = plusmethod(8,7);
        double num2 = plusmethod(4.3,6.8);
        System.out.println("int: " + num1);
        System.out.println("double: "+ num2);
    }
}