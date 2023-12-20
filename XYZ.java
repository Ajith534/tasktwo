package tasktwo;
import java.util.Scanner;

class product {
    
    private int pid;
    private double price;
    private int quantity;

    public product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }
  
    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }
}

public class XYZ {
 
    public static double calculateTotalAmount(product[] b) {
        double totalAmount = 0.0;

        for (product a : b) {
            totalAmount += a.getPrice() * a.getQuantity();
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        product[] b = new product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for a " + (i + 1));
            System.out.print("product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

          b[i] = new product(pid, price, quantity);
        }

        
        int highestPricePid = -1;
        double highestPrice = -1.0;

        for (product a : b) {
            if (a.getPrice() > highestPrice) {
                highestPrice = a.getPrice();
                highestPricePid = a.getPid();
            }
        }

        System.out.println("Product with the highest price:");
        System.out.println("Product ID: " + highestPricePid);
        System.out.println("Price: $" + highestPrice);

       
        double totalAmount = calculateTotalAmount(b);
        System.out.println("Total amount spent on all products: $" + totalAmount);

       
    }
}
