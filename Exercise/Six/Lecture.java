package Exercise.Six;

public class Lecture {
    private String name;
    private String degree;
    private String[] books = new String[4];

    public boolean borrowBook(String nBook) {
        int i;
        for (i = 0; i < 4; i++) {
            if (books[i] == null) {
                break;
            }
        }
        if (i == 4) {
            return false;
        }
        for (int j = 0; j < i; j++) {
            if (books[j] == nBook) {
                return false;
            }
        }
        books[i] = nBook;
        return true;
    }

    public boolean returnBook(String nBook) {
        int i;
        for (i = 0; i < 4; i++)
            if (books[i] == nBook) {
                String bOOks[] = new String[4];
                for (int j = 0; j < 4; j++) {
                    bOOks[j] = books[j];
                }
                for (int k = i; k < 4; k++) {
                    books[k] = books[k + 1];
                }
                books[3] = null;
                return true;
            }
        return false;

    }
}
