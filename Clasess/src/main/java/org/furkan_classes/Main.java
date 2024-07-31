package org.furkan_classes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("George Orwell", "British");
        Author author2 = new Author("Harper Lee", "American");


        Book book1 = new Book("1984", author1, "978-0451524935");
        Book book2 = new Book("Animal Farm", author1, "978-0451526342");
        Book book3 = new Book("To Kill a Mockingbird", author2, "978-0061120084");


        Library library1 = new Library("Central Library");
        library1.addBook(book1);
        library1.addBook(book2);

        Library library2 = new Library("Westside Library");
        library2.addBook(book3);


        LibrarySystem system = new LibrarySystem();
        system.addLibrary(library1);
        system.addLibrary(library2);


        system.printLibraryDetails();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}