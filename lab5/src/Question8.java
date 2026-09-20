//go to Book.java

public class Question8{
    public static void main(){
    Book[] arr = {
        new Book("High noon", "Shaboozey", 5.99),
        new Book("Avatar The Last AirBender", "idk", 12.95)
    };

    Book cheap = arr[0].cheaperBook(arr[0], arr[1]);

    System.out.println("\n " + cheap.title + " is the cheaper book");
    }
}