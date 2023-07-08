import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = Integer.parseInt(sc.nextLine());
        PriorityQueue<Student> students = new PriorityQueue<Student>(num,new Student.comparate());
        String op;
        for(int i=0;i<num;i++){
            op = sc.next();
            if(op.equals("ENTER")){
                students.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
                if(sc.hasNextLine()){
                    sc.nextLine();
                }
            }
            else if(op.equals("SERVED")){
                students.poll();
            }
        }

        if(students.isEmpty()){
            System.out.println("EMPTY");
        }
        else{
            while (!students.isEmpty()) {
                System.out.println(students.poll().getName());
            }
        }
    }
}