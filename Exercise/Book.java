package Exercise;

public class Book {
    private String name;
    private String author;
    private double price;

    public Book(String n, String a, double p) {
        name = n;
        author = a;
        price = p;
    }
    public void printDetails(){
System.out.println(name+","+ author + "," + price);
    }
    public void discount(double percent){
       price = price - percent/100 *price ;
    }
    public static void main(String[] args) {
        Book book = new Book("me", "you", 2);
        book.printDetails();    
    }
}
