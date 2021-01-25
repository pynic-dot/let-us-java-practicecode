public class Condicheck
{
    public static void main(String[] args)
{
    System.out.println("\nStatement before if condition");
    if(10>9)
    {
        System.out.println("\n10 is greater than 9");
    }
    int x = 10,y = 18;
    if(x<y)
    {
        System.out.println("X is less than Y");
    }
    else{
        System.out.println("X is greater than y");
    }

    // Short hand if else
    // variable = (Condition)?expressionTrue:expressionFalse;
    int time = 20;
    String result = (time<18)?"Good day.":"Good Evening.";
    System.out.println(result);
}
}