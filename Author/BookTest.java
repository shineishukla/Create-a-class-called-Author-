public class BookTest {
    public static void main(String[] args) {
        // Test Book Creation
        Book book = new Book(101, "Harry Potter and the...", 1, 25.00, 100);
        System.out.println("Test Book Creation:");
        System.out.println("Book created: " + book);

        // Test Setter Methods
        System.out.println("\nTest Setter Methods:");
        book.setTitle("The Shining");
        book.setAuthorID(2);
        book.setPrice(20.00);
        book.setQuantityInStock(75);
        System.out.println("Updated Book details: " + book);

        // Test Getter Methods
        System.out.println("\nTest Getter Methods:");
        System.out.println("Book ID: " + book.getBookID());
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author ID: " + book.getAuthorID());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("Book Quantity in Stock: " + book.getQuantityInStock());

        // Test toString Method
        System.out.println("\nTest toString Method:");
        System.out.println("Book details: " + book.toString());
    }
}
