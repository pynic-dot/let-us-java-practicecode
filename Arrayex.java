public class Arrayex
{
    public static void main(String[] args)
    {
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        int[] myNum = {10,20,30,40};
        int[] myum = {10000,20000,30000,4000000};
        //accessing array elements
        System.out.println(cars[1]);
        //assigning new element to array
        cars[3] = "Maruti";
        System.out.println(cars[3]);
        //array length
        System.out.println(cars.length);
        //loop through an array
        for(int i=0;i<4;i++)
        {
            System.out.println(cars[i]);
            System.out.println(myNum[i]);
            for(int j:myum)//for each loop
            {
                System.out.println(j);
            }
        }

    }
}