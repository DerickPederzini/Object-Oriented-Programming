package BooksAndLibrary;

import java.util.Date;

public class Book {

    //ids must be unique
    public int id;
    private String title;

    public String getTitle() {
        return title;
    }

    private String [] content;
    int currentPage;
    //int fontSize = 12;

    public Book(String title, String [] content, int current) {
        generateId(id);
        this.title = title;
        this.content = content;
        this.currentPage = current;
    }

    private int generateId(int id){
        this.id = id;
        this.id++;
        return id;
    }

    public void display(int id, int current){
        try{
            System.out.println(this.content[current]);
        }catch (Exception e){
            System.out.println("Unfortunaly, we can display the next page, you have finished the book!");
        }
    }

    public void fllipingPage(int id, String title){
        this.content = new String[]{this.content[this.currentPage + 1]};
        this.currentPage++;
    }



}
