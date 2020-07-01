
import java.util.ArrayList;

public class Student {

    //======= PROPERTIES
    private long id;
    private String name;
    private static ArrayList<Integer> grades;

    //======= CONSTRUCTOR
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    //======= ADD GRADE
    public void addGrade(int grade) {
        grades.add(grade);
    }

    //======= GRADE AVERAGE
    public double getGradeAverage() {
        double bucket = 0;
        for (Integer grade : grades) {
            bucket += grade;
        }
        return bucket / grades.size();
    }

    //

    //======= GETTERS & SETTERS
    public long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Integer> getGrades() {
        return grades;
    }

    public static int updateGrade(int numOfGradeIndexToChange, int changeGradeToWhat) {
        return getGrades().set(numOfGradeIndexToChange, changeGradeToWhat);
    }

    public static void main(String[] args) {
        System.out.println(updateGrade(1, 60));
        System.out.println(getGrades().toString());
    }

}

