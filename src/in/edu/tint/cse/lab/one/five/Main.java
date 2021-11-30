package in.edu.tint.cse.lab.one.five;

public class Main {
    public static void main(String[] args){
        Books bList = new Books();
        bList.addNewBook("Book1", 599, 2020);
        bList.addNewBook("Book2", 699, 2021);
        bList.addNewBook("Book3", 799, 2019);
        bList.display();
        bList.addBook("Book3");
        bList.addBook("Book3");
        bList.addBook("Book3");
        bList.addBook("Book1");
        bList.display();
    }
}
