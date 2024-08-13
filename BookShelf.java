import java.util.*;
public class BookShelf extends Furniture{
    byte NoOfShelves;
    public void Accept()
    {
        super.Accept();
        System.out.print("Enter the number of shelves              : ");
        NoOfShelves = new Scanner(System.in).nextByte();
    }
    public void Display()
    {
        System.out.println("\nThe Details of Book Shelf => ");
        super.Display();
        System.out.println("Number of Shelves : "+NoOfShelves);
    }
}