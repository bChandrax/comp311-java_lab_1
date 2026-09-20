public class Question3{
    public static void main(String[] args) {
        //objects created
        Book b1 = new Book("Transformers", "Optimus Prime", 23.99);
        Book b2 = new Book("Mama Mia", "lol", 0.99);

        //writeout function defined in Book.java
        b1.writeout();
        b2.writeout();
    }
}