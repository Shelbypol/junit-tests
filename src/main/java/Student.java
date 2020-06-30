public class Student {

    public long id;
    public String user;

    public Student(long newId, String newUser){
        this.id = newId;
        this.user = newUser;
    }


    // returns the student's id
    public long getId();

    // returns the student's name
    public String getName();

    // adds the given grade to the grades list
    public void addGrade(int grade);

    // returns the average of the students grades
    public double getGradeAverage();


}
