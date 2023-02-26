import operations.*;
import studentpac.Student;
import history.*;

import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        System.out.println(Subtraction.subtract(3,6));
        System.out.println(Addition.add(4.0,6));
        System.out.println(Addition.add(6,6));
        System.out.println(Addition.add(4.9,6));
        System.out.println(Multiplication.multiply(4,6));
        System.out.println(Division.divide(4,2));


        System.out.println();

        Student s1=new Student("s1","id1",80);
        Student s2=new Student("s2","id2",84);
        Student s3=new Student("s3","id3",99);
        Student s4=new Student("s4","id4",94);

        ArrayList<Student> student=new ArrayList<>();

        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        System.out.println(studentpac.Addition.add(student));


        MyQueue.displayAll();
        System.out.println();
        System.out.println(MyQueue.get(2));

    }
}