package Java_Core_Classes.day46_Polymorphism.PracticeTasks.BrowserTask;

import Java_Core_Classes.day46_Polymorphism.PracticeTasks.BrowserTask.SearchContext;

public interface WebDriver extends SearchContext {

    void get(String url);
    void close();
    void quit();
    void getTitle();


}
