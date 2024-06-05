public class BookDemo {
    public static void main(String[] args) {
        // Sample data
        Author author1 = new Author(1, "J.K. Rowling", "jkrowling@example.com", 'F');
        Author author2 = new Author(2, "Stephen King", "sking@example.com", 'M');
        Author author3 = new Author(3, "George R.R. Martin", "grrm@example.com", 'M');
        Author author4 = new Author(4, "Agatha Christie", "agathachristie@example.com", 'F');
        Author author5 = new Author(5, "Harper Lee", "harperlee@example.com", 'F');

        Book book1 = new Book(101, "Harry Potter and the...", 1, 25.00, 100);
        Book book2 = new Book(102, "The Shining", 2, 20.00, 75);
        Book book3 = new Book(103, "A Game of Thrones", 3, 30.00, 90);
        Book book4 = new Book(104, "Murder on the Orient Express", 4, 15.00, 50);
        Book book5 = new Book(105, "To Kill a Mockingbird", 5, 18.00, 80);

        // Printing sample data
        System.out.println("Authors:");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println(author4);
        System.out.println(author5);

        System.out.println("\nBooks:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
    }
}
