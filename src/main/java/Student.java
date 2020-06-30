import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

//    public static String name;
//    public static long id;
//    public static ArrayList<Integer> grades;

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double bucket = 0;
        for(Integer grade : grades){
            bucket += grade;
        }
        return bucket/ grades.size();
    }


    //GETTERS & SETTERS
    public long getId(){
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String user) {
        this.name = name;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}
