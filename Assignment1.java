import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class StudentNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter contact number: ");
        String contactNum = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\+63\\d{10}");
        Matcher matcher = pattern.matcher(contactNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid number");
        }

        System.out.println("Enter student email: ");
        String studentEmail = scan.nextLine();

        // Long method
        pattern = Pattern.compile("\\w*@students.national-u.edu.ph");
        matcher = pattern.matcher(studentEmail);

        match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        System.out.print("Enter birthday: ");
        String birthday = scan.nextLine();

        // Long method
        pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        matcher = pattern.matcher(birthday);

        match = matcher.matches();

        if (match) {
            System.out.println("valid date");
        } else {
            System.out.println("invalid date");
        }   

        scan.close();
    } 
}   
   

