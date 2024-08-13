import java.util.*;
public class DiningTable extends Furniture{
    byte NoOfLegs;
    public void Accept()
    {
        super.Accept();
        System.out.print("Enter the number of legs                 : ");
        NoOfLegs = new Scanner(System.in).nextByte();
    }
    public void Display()
    {
        System.out.println("\nThe Details of Dining Table => ");
        super.Display();
        System.out.println("Number of Legs    : "+NoOfLegs);
        
    }
}