package Java_Core_Classes.day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number: ");
        long phone = scan.nextLong();

        System.out.println("Enter zipcode: ");
        int zipCode = scan.nextInt(); //next()
        scan.nextLine(); //if the previous method is not nextLine, we have to put an extra nextLine

        System.out.println("School name: ");
        String schoolName = scan.nextLine();  //nextLine()

        System.out.println("Enter city: ");
        String city = scan.nextLine();

        System.out.println("Enter state: ");
        String state = scan.next();

        System.out.println("Enter building number: ");
        int building = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter street name: ");
        String street = scan.nextLine();

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("Address: \n\t" + building + " " + street + "\n\t"
                + city + ", " + state + " " + zipCode);
        System.out.println("School Name: " + schoolName);

        scan.close();


    }
}

/*
1. Enter your age (int)
2. Enter your gender (String- One word ONLY)
3. Enter your full name (String- Multiple
words)
4. Enter your phone number (long)
5. Enter your zip code (int)
6. Enter your School name (String- Can be
Multiple words)
7. Enter your city name (String- Can be
Multiple words)
8. Enter your state name (String- One word
ONLY)
9. Enter your building number (int)
10. Enter your Street name


*/