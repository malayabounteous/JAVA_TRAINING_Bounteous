package SOLID.OpenClose;
import java.util.*;
public class Library {
    List<Book>books;
    public Library(List<Book>booklist)
    {
        this.books=booklist;
    }
    public void printbooks()
    {
       for(Book b: books)
       {
       System.out.println("title"+b.title+" author "+b.author);
       }
    }
}
