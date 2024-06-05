public class Book {
    private int bookID;
    private String title;
    private int authorID;
    private double price;
    private int quantityInStock;

    // Constructor
    public Book(int bookID, String title, int authorID, double price, int quantityInStock) {
        this.bookID = bookID;
        this.title = title;
        this.authorID = authorID;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Getters and Setters
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", authorID=" + authorID +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
