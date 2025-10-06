
public class Main {
    public static void main(String[] args) {

    Library library = new Library();
    library.addBook(new Book("Star Wars: Return of the Jedi", "George Lucas", "0000AAAA"));
    library.addBook(new Book("Egy bárány élete", "Anonymus", "0001AAAA"));
    library.addBook(new Book("Game of Thrones", "George RR Martin", "0002AAAA"));
    library.addBook(new Book("Vuk", "Fekete István", "0003AAAA"));
    library.registerMember(new Member("Fody G", 0001));
    library.registerMember(new Member("Demjén Apostol", 0002));
    library.registerMember(new Member("Kákó Pista", 0003));
    library.registerMember(new Member("Vass Gabibácsi", 0004));

    //library.showBooks();
    //library.showMembers();
    System.out.println("Kölcsönzés: " + (library.borrowBook("0001AAAA", 0002) ? "sikeres" : "sikertelen"));
    System.out.println("Visszaadás: " + (library.returnBook("0002AAAA", 0001) ? "sikeres" : "sikertelen"));
    System.out.println("Kölcsönzés: " + (library.borrowBook("0001AAAA", 0003) ? "sikeres" : "sikertelen"));

    System.out.println(library.showBooksAtMembers(0002));
    }
}
