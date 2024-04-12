package Internship;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("welcome to the Random password Generator:\n" +
                "Enter the length of password: ");
        int passwordLength= sc.nextInt();
        String allChar = "0123456789abcdeghijklmnopqrstuvwxyz!@#$%^&*()_+,./;'[]<>?::{}-=|`~ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random ran = new Random();
        String password = "";
        for (int i = 0; i < passwordLength; i++) {
            int leng =ran.nextInt(allChar.length());
            password = password+allChar.charAt(leng);
        }
        System.out.println("Random password is : "+password);
    }
}
/*---------------------------------OUTPUT-------------------------------------------------------------------------------------------------
"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=54964:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Acer\IdeaProjects\javaCore\out\production\operator Internship.PasswordGenerator
welcome to the Random password Generator:
Enter the length of password: 10
Random password is : Ck@:#r!Y%)

Process finished with exit code 0*/
