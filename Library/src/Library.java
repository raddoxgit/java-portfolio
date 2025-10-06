import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    //Library Class Methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public boolean borrowBook(String isbn, int memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);
        if (book != null && member != null && book.getIsAvailable()) {
            book.setAvailable(false);
            member.borrowBook(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn, int memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);
        if (book != null && member != null) {
            book.setAvailable(true);
            member.returnBook(book);
            return true;
        }
        return false;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    private Member findMemberById(int memberId) {
        for (Member m : members) {
            if (m.toString().contains(" (ID: " + memberId)) {
                return m;
            }
        }
        return null;
    }

    //To test
    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public List<Book> showBooksAtMembers(int memberId) {
        Member member = findMemberById(memberId);
        if (member != null) {
            return member.getBorrowedBooks();
        }
        return null;
    }
}
