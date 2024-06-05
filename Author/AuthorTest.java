public class AuthorTest {
    public static void main(String[] args) {
        // Test Author Creation
        Author author = new Author(1, "J.K. Rowling", "jkrowling@example.com", 'F');
        System.out.println("Test Author Creation:");
        System.out.println("Author created: " + author);

        // Test Setter Methods
        System.out.println("\nTest Setter Methods:");
        author.setName("Stephen King");
        author.setEmail("sking@example.com");
        author.setGender('M');
        System.out.println("Updated Author details: " + author);

        // Test Getter Methods
        System.out.println("\nTest Getter Methods:");
        System.out.println("Author ID: " + author.getAuthorID());
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Email: " + author.getEmail());
        System.out.println("Author Gender: " + author.getGender());

        // Test toString Method
        System.out.println("\nTest toString Method:");
        System.out.println("Author details: " + author.toString());
    }
}
