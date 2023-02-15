package util;

import beans.Student;
import main.Config;

public class StudentUtil {

    public static Student fillStudent() {
        String name = İnputUtil.requieText("enter name");
        String surname = İnputUtil.requieText("enter surname");
        String className = İnputUtil.requieText("enter class");
        int age = İnputUtil.requieNumber("enter age");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegistredStudent() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1)+"."+st.getFullİnfo());
        }
    }

    public static void registerStudents() {
        int count = İnputUtil.requieNumber("Nece telebe qeydiyyatdan kecireceksiniz");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");
            Config.students[i] = StudentUtil.fillStudent();
        }

        System.out.println("registration completed successfully");
        StudentUtil.printAllRegistredStudent();
    }

    public static void findStudentsAndPrint() {
        String text = İnputUtil.requieText("Type name ,surname or class name");
     Student [] result=findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullİnfo());

        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found] = st;
                found++;
            }
        }
        return result;
    }
    
    public static void UpdateStudent(){
        StudentUtil.printAllRegistredStudent();
                int i = İnputUtil.requieNumber("Necenci adamda deyişklik etmek isteyirsiniz?");
                System.out.println("Yeni melumatları daxil edin");
                Student s = StudentUtil.fillStudent();

                Config.students[i-1] = s;
    }
}
