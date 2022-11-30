package Java_Core_Classes.day36_Inheritance.PracticeTasks.bookTask;

public class AudioBook extends Book{

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public void listen(){
        System.out.println(title + " by " + author + " is being listened.");
    }

}
