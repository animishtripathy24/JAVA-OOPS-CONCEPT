import java.util.*;

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product) {
        cartItems.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void removeItem(Product product) throws ProductNotFoundException {
        if (cartItems.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            throw new ProductNotFoundException(product.getName() + " not found in the cart.");
        }
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Main_Demo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ShoppingCart cart = new ShoppingCart();

            int choice;
            do {
                System.out.println("\n1. Add Product to Cart");
                System.out.println("2. Remove Product from Cart");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character left by nextInt()

                switch (choice) {
                    case 1:
                        System.out.print("Enter the product name to add: ");
                        String productNameToAdd = scanner.nextLine();
                        Product productToAdd = new Product(productNameToAdd);
                        cart.addItem(productToAdd);
                        break;
                    case 2:
                        System.out.print("Enter the product name to remove: ");
                        String productNameToRemove = scanner.nextLine();
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
            } while (choice != 3);
        } catch (ProductNotFoundException e) {
            System.out.println("Product not found in the cart: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}

