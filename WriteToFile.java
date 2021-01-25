import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
public static void main(String[] args)
{
try
{
FileWrite myWrite = new FileWrite("fileName.txt");
myWrite.write("Files in Java might be tricky, but it is fun enough!");
}
catch(IOException e)
{
System.out.println("An error occurred.");
e.printStackTrace():
}
}
}
