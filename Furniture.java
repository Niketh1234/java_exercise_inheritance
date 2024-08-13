import java.util.Scanner;
public class Furniture{
    double Height,Width,Price;
    String Color;
    QualityType Qty;

    public void Accept()
    {
        System.out.print("Enter the height                         : ");
        Height = new Scanner(System.in).nextDouble();
        System.out.print("Enter the width                          : ");
        Width = new Scanner(System.in).nextDouble();
        System.out.print("Enter the color                          : ");
        Color = new Scanner(System.in).next();
        System.out.print("Enter the quality type (Durable/Fragile) : ");
        String var = new Scanner(System.in).next();
        if(var.toLowerCase().equals("durable"))
            Qty = QualityType.DURABLE;
        else
            Qty = QualityType.FRAGILE;
        System.out.print("Enter the price                          : ");
        Price = new Scanner(System.in).nextDouble();
    }
    public void Display()
    {
        System.out.println("Height            : "+Height);
        System.out.println("Width             : "+Width);
        System.out.println("Color             : "+Color);
        System.out.println("quality           : "+Qty);
        System.out.println("price             : "+Price);
        
    }
}
