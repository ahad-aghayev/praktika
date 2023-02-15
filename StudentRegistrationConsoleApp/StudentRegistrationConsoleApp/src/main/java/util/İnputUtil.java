package util;

import java.util.Scanner;

public class İnputUtil {

    public static String requieText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title );
        String answer = sc.nextLine();
        return answer;

    }

    public static int requieNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title );
        int answer = sc.nextInt();
        return answer;
    }
}
