package Exercise.Six;

public class Student {
    private String id;
    private String name;
    private String book;

    public boolean borrowBook(String nBook) {
        if (book.length() > 0) {
            book = nBook;
            return true;
        }
        return false;
    }
    public boolean returnBook(String nBook){
    if (book.equals(nBook)) {
    book =null;
    return true;
    }
    else
    return false;
    }
}
