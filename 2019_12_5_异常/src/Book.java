import java.util.Scanner;
public class Book implements Comparable<Book> {
    private String ISBN;
    private  String title;
    private  String author;
    private  int price;
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //obj不是Book 不相等
        if (!(instanceof Book)){
            return false;
        }
        //向下转型
        Book book = (Book) obj;
        return this.ISBN.equals(book.ISBN);
    }
    @Override

}