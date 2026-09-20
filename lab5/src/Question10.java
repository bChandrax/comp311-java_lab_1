public class Question10 {
    public static void main(String[] args) {
        Library Biulms = new Library();
        Book[] shelf = {
            new Book("Diamonds", "B00sted", 12.00),
            new Book("Still Grateful", "Zwothle Keys", 12.35),
            new Book("I'd Do Anything To Make You Smile", "Jack Harlow", 0),
            new Book("Keep On Holding On", "Zwothle Keys", 12.05)
        };

        Biulms.printAllBooks();

        for(Book book : shelf){
            Biulms.addBook(book);
        }

        Biulms.printAllBooks();
    }
}
