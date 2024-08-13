import java.util.Scanner;
public class Program
{
    public static int AddToStock(Furniture[] furnitures,int index,String fType){
        if(fType == "bookShelf")
        {
            System.out.println("Enter the details of the Book Shelf => ");
            furnitures[index] = new BookShelf();
        }
        else{
            System.out.println("Enter the details of the Dining Table => ");
            furnitures[index] = new DiningTable();
        }
        furnitures[index].Accept();
        return index+1;
    }
    public static void ShowStockDetails(Furniture[] furnitures,int index){
        for(int i = 0;i<index;i++)
            furnitures[i].Display();
    }
    public static double TotalStockValue(Furniture[] furnitures,int index){
        double value = 0;
        for(int i =0;i<index;i++)
            value+= furnitures[i].Price;
        return value;
    }
    public static void main(String args[])
    {
        System.out.println("\nHere is your Menu...");
        Furniture[] furnitures = new Furniture[5];
        int index = 0;
        do{
            System.out.println("\n1. Book Shelf\n2. Dining Table\n3. Show Details\n4. Show Total Stock Value\n5. Exit");
            System.out.print("Enter you choice : ");
            switch(new Scanner(System.in).nextByte()){
                case 1:
                    System.out.println("Number of Entries : "+AddToStock(furnitures,index++,"bookShelf"));
                    break;
                case 2:
                    System.out.println("Number of Entries : "+AddToStock(furnitures,index++,"diningTable"));
                    break;
                case 3:
                    ShowStockDetails(furnitures,index);
                    break;
                case 4:
                    System.out.println("The total stock value is : "+TotalStockValue(furnitures,index));
                    break;
                case 5:
                    System.exit(0);
            }
        }while(index<5);
    }
}