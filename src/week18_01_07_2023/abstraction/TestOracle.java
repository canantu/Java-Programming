package week18_01_07_2023.abstraction;

public class TestOracle {
    public static void main(String[] args) {

        OracleDatabase oracleDatabase = new OracleDatabase("DB1");

        oracleDatabase.save("Adam");
        oracleDatabase.save("Aaron");

        System.out.println(oracleDatabase.names);

        oracleDatabase.update("Adam", "Moses");

        System.out.println(oracleDatabase.names);
    }
}
