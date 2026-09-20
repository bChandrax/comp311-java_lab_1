public class Book {

    //building the class as required in Question 1
    String title;
    String author;
    double price;

    //building the constructor as required in Question 2
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //for use in Question 3
    public void writeout(){
        System.out.println("\nBOOK Title: " + title);
        System.out.println("BOOK Author: " + author);
        System.out.println("BOOK Price: " + price + "\n");
    }

    //for use in Questinon 4
    public void getSummary(){
        System.out.println("\n The book \"" + title + "\" written by \"" + author + "\" costs " + price + ".");
    }

    //the comparing books method fpr Question 8
    public Book cheaperBook(Book b1, Book b2){

        //compare the books and return the cheaper one
        if (b1.price<=b2.price){
            return b1;
        }else{
            return b2;
        }
    }
}
