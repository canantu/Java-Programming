package week18_01_07_2023.abstraction;



public class OracleDatabase extends Database {
    public OracleDatabase(String name) {
        super(name);
    }

    @Override
    void save(String name) {
        names.add(name);
        System.out.println(name + " is added to the database");
    }

    @Override
    void delete(String name) {
        names.remove(name);
        System.out.println(name + " is removed from the database");
    }

    @Override
    void update(String oldName, String newName) {
        names.remove(oldName);
        names.add(newName);
    }
}
