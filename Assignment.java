import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Assignment {
    private String name;
    private double price;
    private String description;

    public Assignment(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getPriceFormatted() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(price);
    }

    public static void main(String[] args) {
        ArrayList<Assignment> products = new ArrayList<>();

        products.add(new Assignment("Product A", 20.50, "This is product A"));
        products.add(new Assignment("Product B", 15.99, "This is product B"));
        products.add(new Assignment("Product C", 10.00, "This is product C"));
        products.add(new Assignment("Product D", 50.00, "This is product D"));
        products.add(new Assignment("Product E", 30.25, "This is product E"));

        System.out.println("Unsorted product list:");
        for (Assignment product : products) {
            System.out.println(product.getName() + " - " + product.getPriceFormatted() + " - " + product.getDescription());
        }

        // Sort by price
        Collections.sort(products, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment p1, Assignment p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("\nSorted by price:");
        for (Assignment product : products) {
            System.out.println(product.getName() + " - " + product.getPriceFormatted() + " - " + product.getDescription());
        }

        // Sort by name
        Collections.sort(products, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment p1, Assignment p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("\nSorted by name:");
        for (Assignment product : products) {
            System.out.println(product.getName() + " - " + product.getPriceFormatted() + " - " + product.getDescription());
        }
    }
}