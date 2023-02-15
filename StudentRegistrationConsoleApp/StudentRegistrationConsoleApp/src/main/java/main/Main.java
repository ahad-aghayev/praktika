package main;

import beans.Student;
import util.MenuUtil;
import util.StudentUtil;
import util.İnputUtil;

public class Main {

    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = İnputUtil.requieNumber("Want do you to do?"
                    + "\n1. Register Student"
                    + "\n2. Show all students"
                    + "\n3. Find students"
                    + "\n4. Update student"
                    + "\n5. Exit");

        MenuUtil.processMenu(menu);
        }
    }
}
