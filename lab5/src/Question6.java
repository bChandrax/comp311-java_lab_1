public class Question6 {

    public static void main(String[] args) {
    // array of books
        Book[] shelf = {
            new Book("All the lights", "Kanye", 0.99),
            new Book("Look Like my Mama", "AZ Chike", 0.95),
            new Book("Carolina Reaper", "Amelie Ferman", 0.20)
        };
        
        //use the method for each book
        for (Book book : shelf) {
            book.getSummary();
        }
    }
}
