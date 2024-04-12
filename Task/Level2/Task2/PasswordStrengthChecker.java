package Internship;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password : ");
        String password = sc.next();
        StrengthChecker(password);
    }
    public static void StrengthChecker(String password){
        int length = password.length();
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        String spacialChar = "!@#$%^&*?~`,./<>;':[]{}-()";
        int inx = 0 ;
        boolean uppercase = false;
        boolean lowercase = false;
        boolean numberchck = false;
        boolean special = false;
        while (length > inx){
            //checking upper case is available or not
        for (int i = 0; i < upperCase.length(); i++) {
            char cp= password.charAt(inx);
            char uc = upperCase.charAt(i);
            if (cp == uc){
//                System.out.println(cp+" :: "+uc);
                uppercase = true;
                break;
            }
        }//lowercase checking
            for (int i = 0; i < lowerCase.length(); i++) {
                char cp= password.charAt(inx);
                char lc = lowerCase.charAt(i);
                if (cp == lc){
                    lowercase = true;
                    break;
//                    System.out.println(cp+" :: "+lc);
                }
            }
            //number checking
            for (int i = 0; i < number.length(); i++) {
                char cp= password.charAt(inx);
                char num = number.charAt(i);
                if (cp == num){
                    numberchck = true;
                    break;
//                    System.out.println(cp+" :: "+num);
                }
            }//spacialChar checking
            for (int i = 0; i < spacialChar.length(); i++) {
                char cp= password.charAt(inx);
                char sc = spacialChar.charAt(i);
                if (cp == sc){
                    special = true;
                    break;
//                    System.out.println(cp+" :: "+sc);
                }
            }
        inx++;
        }
        int score = 0;
        if (length >= 8)
            score += 5*length;
        if (uppercase)
            score += 10;
        if (lowercase)
            score += 10;
        if (special)
            score += 10;
        if (special)
            score += 10;

        if (score < 60){
            System.out.println("password is too week");
        } else if (score < 80) {
            System.out.println("password is week");
        } else if (score < 100) {
            System.out.println("password is medium");
        }  else {
            System.out.println("password is too strong");
        }

        /*
        if ( length > 8 && numberchck && uppercase && special && lowercase)
            System.out.println("password is to strong");
        else if (length > 8 && numberchck && uppercase && special)
            System.out.println("password is medium");
        else if (length > 8 && numberchck && uppercase)
            System.out.println("password is easy");
        else if (lowercase && numberchck)
            System.out.println("password is so easy");
        else
            System.out.println("you need to provide Strong password");*/
    }
}
/*----------------------------------output------------------------------------------
Enter the password : HImanshu@12356
password is too strong

"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=55329:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Acer\IdeaProjects\javaCore\out\production\operator Internship.PasswordStrengthChecker
Enter the password : adjsfaksjasdfh152
password is medium


*/
