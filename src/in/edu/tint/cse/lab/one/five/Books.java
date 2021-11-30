package in.edu.tint.cse.lab.one.five;
import java.util.ArrayList;

public class Books {
    class Book{
        String title;
        int price;
        int yearOfPub;
        int noOfCopy;
        Book(String title, int price, int yearOfPub){
            this.title = title;
            this.price = price;
            this.yearOfPub = yearOfPub;
            this.noOfCopy = 1;
        }
    }
    ArrayList<Book> list = new ArrayList<>();
    void addNewBook(String title, int price, int yearOfPub){
        Book b = new Book(title, price, yearOfPub);
        list.add(b);
    }
    void addBook(String title){
        for (Book b :
                list) {
            if (b.title == title) {
                b.noOfCopy += 1;
            }
        }
    }
    void display(){
        for (Book b :
                list) {
            System.out.println("Title: "+b.title);
            System.out.println("Price: "+b.price);
            System.out.println("Year Of Publication: "+b.yearOfPub);
            System.out.println("No of Copies: "+b.noOfCopy+"\n");
        }
    }
}
