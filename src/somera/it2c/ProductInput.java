package somera.it2c;

import java.util.Scanner;

public class ProductInput {

  
    public void getProductsFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

       
        int[] ids = new int[numProducts];
        String[] names = new String[numProducts];
        String[] categories = new String[numProducts];
        int[] stocks = new int[numProducts];
        double[] prices = new double[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Enter Product ID: ");
            ids[i] = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Product Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Enter Product Category: ");
            categories[i] = scanner.nextLine();

            System.out.print("Enter Stock Quantity: ");
            stocks[i] = scanner.nextInt();

            System.out.print("Enter Price per Unit: ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

       
        displayProducts(ids, names, categories, stocks, prices);
    }

    
    private void displayProducts(int[] ids, String[] names, String[] categories, int[] stocks, double[] prices) {
        System.out.println("\nProduct Details:");
        for (int i = 0; i < ids.length; i++) {
            System.out.println("Product ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Category: " + categories[i]);
            System.out.println("Stock: " + stocks[i] + " (" + (stocks[i] < 1 ? "Out of Stock" : "Available") + ")");
            System.out.println("Price per Unit: $" + prices[i]);
            System.out.println(); 
        }
    }
}