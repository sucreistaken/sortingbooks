import java.util.Comparator;

public class Student {
    private int id;
    private  String name;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
     static class comparate implements Comparator<Student> {

         @Override
         public int compare(Student o1, Student o2) {
             if (o1.getCgpa()< o2.getCgpa()){
                 return 1;
             }else if (o1.getCgpa()> o2.getCgpa()){
                 return -1;
             }else {
                 if(o1.getName().compareTo(o2.getName()) < 0){
                    return -1;
                 }else if(o1.getName().compareTo(o2.getName()) > 0){
                     return 1;
                 } else{
                    if(o1.getId()< o2.getId()){
                        return -1;
                    }else return 1;
                 }
             }
         }
     }
}
