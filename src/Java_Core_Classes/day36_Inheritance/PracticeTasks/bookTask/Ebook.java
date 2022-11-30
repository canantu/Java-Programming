package Java_Core_Classes.day36_Inheritance.PracticeTasks.bookTask;

public class Ebook extends Book{

    public Ebook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public void readBook(){
        System.out.println(title + " by " + author + " is being read.");
    }

}
