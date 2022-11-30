package Java_Core_Classes.day36_Inheritance.PracticeTasks.bookTask;

public class Library {
    public static void main(String[] args) {

        Ebook ebook = new Ebook("1984", "dystopia", "George Orwell", 20  );
        AudioBook audioBook = new AudioBook("Animal Farm", "political satire", "George Orwell", 10);

        ebook.readBook();
        audioBook.listen();

        System.out.println(ebook);
        System.out.println(audioBook);
    }
}
