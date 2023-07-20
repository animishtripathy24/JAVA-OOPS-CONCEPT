import java.util.*;

//Exception class
class ProductNotFoundException extends Exception 
{
    //constructor
    ProductNotFoundException(String message)
    {
        super(message);
    }
}
//ShoppingCart class
class ShoppingCart {
    private ArrayList<Product> cartItems;

    //constructor
    ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product) {
        cartItems.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void removeItem(Product product) throws ProductNotFoundException
    {
        if(cartItems.contains(product)==true)
        {
            cartItems.remove(product);
            System.out.println(product.getName() + " removed from the cart.");
        } 
        else 
        {
            throw new ProductNotFoundException(product.getName() + " not found in the cart.");
        }
    }
}
//Product class
class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name);
    }

    public int hashCode()
    {
        return Objects.hash(name);
    }
}

// Step 3: ExceptionHandling class
public class ExceptionHandling
{
    public static void main(String[] args) throws ProductNotFoundException,InputMismatchException
    {
            ShoppingCart cart = new ShoppingCart();
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("\n1. Add Product to Cart");
                System.out.println("2. Remove Product from Cart");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter the product name to add: ");
                        String productNameToAdd = sc.nextLine();
                        Product productToAdd = new Product(productNameToAdd);
                        cart.addItem(productToAdd);
                        break;
                    case 2:
                        System.out.print("Enter the product name to remove: ");
                        String productNameToRemove = sc.nextLine();
                        Product productToRemove = new Product(productNameToRemove);
                        cart.removeItem(productToRemove);
                        break;
                    case 3:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }while(choice != 3);

            sc.close();
    }
}
