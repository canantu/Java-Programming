package week18_01_07_2023.abstraction;

import java.util.ArrayList;

public abstract class Database {

    // we can have constructor in abstract class in order to initialize common variables in abstract classes
    // to set rules on variables setting
    String name;
    public Database(String name){
        this.name = name;
    }

    protected ArrayList<String> names = new ArrayList<>();
    abstract void save(String name);

    abstract void delete(String name);
    abstract void update(String oldName, String newName);


}
