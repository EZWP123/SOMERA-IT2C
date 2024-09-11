
package somera.it2c;


public class Product {
    
    int id;
    
    String name;
    String category;
     int stock;
    double price;

    Product(int id, String name, String category, int stock, double price) {
        
    }

   
    public void addProduct(int pid, String pname, String pcategory, int pstock, double pprice) {
        this.id = pid;
        this.name = pname;
        this.category = pcategory;
        this.stock = pstock;
        this.price = pprice;
    
        
       
        
}
      public void viewProduct() {
        String status = (this.stock < 1) ? "Out of Stock" : "Available";
        

        System.out.println("Product ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Category: " + this.category);
        System.out.println("Stock: " + this.stock + " (" + status + ")");
        System.out.println("Price per Unit: $" + this.price);
      
    System.out.printf("%-10d %-20s %-10d %-10d %-10.2f %-10.2f %-15s %-10.2f%n",
                    this.id, this.name, this.category, this.stock, this.price);
}
}

