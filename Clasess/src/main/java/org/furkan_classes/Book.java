package org.furkan_classes;


public class Book {
    private String title;
    private Author author;
    private String isbn;

    public Book(String title, Author author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author.toString() + " (ISBN: " + isbn + ")";
    }
}

