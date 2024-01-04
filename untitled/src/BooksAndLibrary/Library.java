package BooksAndLibrary;

import java.util.Hashtable;

public class Library{
    int id;
    Hashtable <Integer, Book> libraries = new Hashtable<Integer, Book>();
    Book activeBook;

    public Library() {

    }

    protected void LibraryAdd(Book book){
        this.id = GenerateId(id);
        libraries.put(id, book);
    }

    private int GenerateId(int id){
        id++;
        return id;
    }

    public void isActive(Book activeBook){
        this.activeBook = activeBook;
    }

}