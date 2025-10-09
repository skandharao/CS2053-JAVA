class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : ₹" + this.price);
        System.out.println("------------------------");
    }
}

public class LAB1 {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 499.0);
        Book book2 = new Book("Atomic Habits", "James Clear", 599.0);

        book1.displayDetails();
        book2.displayDetails();
    }
}
