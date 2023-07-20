package shop;

import java.util.*;

interface Product {
    void displayInfo();

    double calculatePrice();
}

class Electronics implements Product {
    public String brand;
    private int warrantyPeriod;

    //contructor
    Electronics(String brand, int warrantyPeriod) {
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    //Overriding
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }

    //Overriding
    public double calculatePrice() {
        //assumming fixed price Rs 500 for all the electronics
        return 500.0;
    }

    public void checkWarranty() {
        System.out.println("Warranty is valid for " + warrantyPeriod + " months.");
    }
}

// Additional subclasses for Electronics
class Smartphone extends Electronics {
    private String model;
    private int RAM;

    //constructor
    Smartphone(String brand, int warrantyPeriod, String model, int RAM) {
        super(brand, warrantyPeriod);
        this.model = model;
        this.RAM = RAM;
    }

    // Additional methods for Smartphone
    public void makeCall(String number) {
        System.out.println("Making a call to " + number + " using " + model + " phone.");
    }
}

class Laptop extends Electronics {
    private String processor;
    private int storageCapacity;

    //constructor
    Laptop(String brand, int warrantyPeriod, String processor, int storageCapacity) {
        super(brand, warrantyPeriod);
        this.processor = processor;
        this.storageCapacity = storageCapacity;
    }
    // Additional methods for Laptop
    public void runProgram(String programName) {
        System.out.println("Running " + programName + " on " + brand + " laptop.");
    }
}

class Clothing implements Product {
    private String size;
    private String color;

    //constructor
    Clothing(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    //Overriding
    public void displayInfo() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

    //Overriding
    public double calculatePrice() {
        return 100.0;
    }

    public void displaySizeAndColor() {
        System.out.println("Size: " + size + ", Color: " + color);
    }
}

// Additional subclasses for Clothing
class Shoes extends Clothing {
    private String brand;
    private String material;

    //constructor
    Shoes(String size, String color, String brand, String material) {
        super(size, color);
        this.brand = brand;
        this.material = material;
    }

    // Additional methods for Shoes
    public void wear() {
        System.out.println("Wearing " + brand + " shoes.");
    }
}

class TShirt extends Clothing {
    private String fabric;
    private String pattern;

    //constructor
    TShirt(String size, String color, String fabric, String pattern) {
        super(size, color);
        this.fabric = fabric;
        this.pattern = pattern;
    }

    // Additional methods for TShirt
    public void fold() {
        System.out.println("Folding the " + fabric + " t-shirt with " + pattern + " pattern.");
    }
}

class Books implements Product {
    private String author;
    private int pageCount;

    //constructor
    Books(String author, int pageCount) {
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    //Overriding
    public void displayInfo() {
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }

    //Overriding
    public double calculatePrice() {
        // TODO: Implement price calculation logic for books
        return 0;
    }

    public void displayAuthorAndPageCount() {
        System.out.println("Author: " + author + ", Page Count: " + pageCount);
    }
}

// Additional subclasses for Books
class Novel extends Books {
    private String genre;
    private String language;

    //constructor
    Novel(String author, int pageCount, String genre, String language) {
        super(author, pageCount);
        this.genre = genre;
        this.language = language;
    }

    // Additional methods for Novel
    public void read() {
        System.out.println("Reading the " + genre + " novel in " + language + " language.");
    }
}

class Textbook extends Books {
    private String subject;
    private int edition;

    //constructor
    Textbook(String author, int pageCount, String subject, int edition) {
        super(author, pageCount);
        this.subject = subject;
        this.edition = edition;
    }

    // Additional methods for Textbook
    public void study() {
        System.out.println("Studying the " + subject + " textbook (Edition " + edition + ").");
    }
}

public class Shopping
{
    public static void main(String[] args)throws Exception
    {
        ArrayList<Product> products = new ArrayList<>();

        // Adding products to the list
        products.add(new Smartphone("Apple", 12, "iPhone 14 pro max", 8));
        products.add(new Laptop("HP", 24, "Intel i5", 512));
        products.add(new Shoes("9", "Black", "Addidas", "Leather"));
        products.add(new TShirt("M", "Red", "Cotton", "Striped"));
        products.add(new Novel("J.K. Rowling", 400, "Fantasy", "English"));
        products.add(new Textbook("Author", 800, "Java Programming", 2));

        // Displaying information about each product
        for (Product product : products) {
            product.displayInfo();
            System.out.println("Price: Rs " + product.calculatePrice());
            System.out.println();

            if (product instanceof Electronics) {
                ((Electronics) product).checkWarranty();
            } else if (product instanceof Clothing) {
                ((Clothing) product).displaySizeAndColor();
            } else if (product instanceof Books) {
                ((Books) product).displayAuthorAndPageCount();
            }

            System.out.println("\n\n");
        }

        // Additional behaviors for some specific products
        Smartphone smartphone = (Smartphone) products.get(0);
        smartphone.makeCall("0123456789");

        Laptop laptop = (Laptop) products.get(1);
        laptop.runProgram("Java IDE");

        Shoes shoes = (Shoes) products.get(2);
        shoes.wear();

        TShirt tShirt = (TShirt) products.get(3);
        tShirt.fold();

        Novel novel = (Novel) products.get(4);
        novel.read();

        Textbook textbook = (Textbook) products.get(5);
        textbook.study();
    }
}

