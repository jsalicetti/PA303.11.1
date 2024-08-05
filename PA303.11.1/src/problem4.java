import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>();

//        Student Rumpa = new Student(33, "rumpa", 3.68);
//        Student Ashis = new Student(85, "ashis", 3.85);
//        Student Samiha = new Student(56, "samiha", 3.75);
//        Student Samara = new Student(19, "samara", 3.75);
//        Student Fahim = new Student(22, "fahim", 3.76);
//        Students.add(Rumpa);
//        Students.add(Ashis);
//        Students.add(Samiha);
//        Students.add(Samara);
//        Students.add(Fahim);

        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt();
        for(int i = 0; i < students; i++){
            int ID = scan.nextInt();
            String name = scan.next();
            double CGPA = scan.nextDouble();
            Student student = new Student(ID,name,CGPA);
            Students.add(student);
        }
        Collections.sort(Students);
        System.out.println(Students);

    }

}

class Student implements Comparable<Student>{
    int ID;
    String Name;
    double CGPA;

    @Override
    public String toString() {
        return this.Name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public Student(int ID, String name, double CGPA) {
        this.ID = ID;
        Name = name;
        this.CGPA = CGPA;
    }

    @Override
    public int compareTo(Student student) {
        if(this.CGPA < student.getCGPA()){
            return 1;
        }else if (this.CGPA > student.getCGPA()){
            return -1;
        }
        return compareNames(student);
    }
    public int compareNames(Student student){
        if(this.Name.compareTo(student.getName()) > 0){
            return 1;
        } else if(this.Name.compareTo(student.getName()) < 0){
            return -1;
        }return compareID(student);
    }
    public int compareID(Student student){
        if(this.ID < student.ID){
            return 1;
        } else if(this.ID > student.ID){
            return -1;
        }return 0;
    }
}