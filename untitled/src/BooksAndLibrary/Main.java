package BooksAndLibrary;

public class Main {
    public static void main(String[] args) {
        //the objective of this exercise is to simulate a book and a library,
        //This exercise must:
        //Have a way to register books in a library, as well as to see active book (only one)
        //Register the books of the library and display the book current page
        //only one book at a time


        Book harryPotter = new Book("HarryPotter and the Globet of Fire", new String [] {"this is a Harry Potter book", "Nice stuff", "Honestly great" }, 0);
        harryPotter.display(1, 0);

        harryPotter.fllipingPage(1, "HarryPotter and the Globet of Fire");
        harryPotter.display(1, 0);

        Book lordOfTheRings = new Book("LordOfTheRings and the Two Towers", new String [] {"this is a LOR book", "Nice stuff LOR", "Honestly great LOR" }, 0);
        System.out.println(lordOfTheRings.getTitle());
        lordOfTheRings.display(2, 2);
        lordOfTheRings.fllipingPage(2, "LordOfTheRings" );

        Book theOverStory = new Book("TheOverStory", new String [] {"this is The Overstory Book", "Nice stuff Overstory", "Honestly great Overstory" }, 0);
        theOverStory.display(1, 2);


        System.out.println("================LIBRARY================");
        Library library = new Library();
        library.LibraryAdd(harryPotter);
        library.LibraryAdd(lordOfTheRings);
        library.LibraryAdd(theOverStory);


        System.out.println(library.libraries.get(2).getTitle());

        library.isActive(theOverStory);

        System.out.println(library.activeBook.getTitle());


    }
}