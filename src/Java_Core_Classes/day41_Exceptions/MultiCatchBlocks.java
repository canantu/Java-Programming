package Java_Core_Classes.day41_Exceptions;

import Java_Core_Classes.day38_Inheritance.Practice_Tasks.Employee_Task.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;  // produces NullPointerException
        try{
            System.out.println(employee.gender);
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }
        /*  if the exception is never been caught, we use RuntimeException at the end as the insurance
        catch (RuntimeException e){
            e.printStackTrace();
        }
        */





    }
}
