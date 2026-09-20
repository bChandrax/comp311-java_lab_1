public class PrivateBook {
    //variables
    private String title;
    private String author;
    private double price;

    //constructor
    public PrivateBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //default constructor
    public PrivateBook(){}

    //The getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }

    //The setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //for use in Questinon 6
    public void getSummary(){
        System.out.println("\n The book \"" + getTitle() + "\" written by \"" + getAuthor() + "\" costs " + getAuthor() + ".");
    }
}
