package SOLID.OpenClose;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book>booklist=new ArrayList<>();
        booklist.add(new Book("JAva","s kumar"));
         booklist.add(new Book("C++","m happppy"));
         Library lib=new Library(booklist);
         lib.printbooks();
    }
}
