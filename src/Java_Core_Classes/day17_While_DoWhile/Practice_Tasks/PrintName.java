package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

public class PrintName {

    public static void main(String[] args) {

        String name = "canan";
        String newName = "";

        for (int i = 0; i < name.length(); i++) {

            if(i % 2 == 0){
                newName += (""+name.charAt(i)).toUpperCase();
            }else {
                newName += ("" + name.charAt(i)).toLowerCase();
            }
        }
        System.out.println(newName);
    }
}
