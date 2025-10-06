import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private int memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    //Creating the Class Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    //Member Class Methods
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString () {
        return "Name: " + getName() + " (ID: " + getMemberId() + ")";
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
