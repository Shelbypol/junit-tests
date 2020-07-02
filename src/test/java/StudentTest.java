import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

//    Student student;

//    @Before
//    public void setUp() {
//        Student student = new Student(1L, "Shelby");
//        student.addGrade(50);
//        student.addGrade(100);
//        student.addGrade(80);
//        student.updateGrade(0, 70);
//        student.updateGrade(2, 90);
//        student.deleteGrade(1);
//    }


    @Test
    public void testConstructor() {
        Student student = new Student(1L, "Shelby");
        assertEquals("Check if name is in the Constructor", "Shelby", student.getName());
        assertEquals("Check if 'id' is in the Constructor", 1L, student.getId());
        assertTrue("Check if size of the grades array matches", student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade(){
        Student student = new Student(1L, "Shelby");
        assertEquals(0, student.getGrades().size());

        student.addGrade(100);
        assertEquals(1, student.getGrades().size());
        assertEquals(100, student.getGrades().get(0), 0);
    }

    @Test
    public void testGetGradeAverage() {
        Student student = new Student(1L, "Shelby");
        student.addGrade(0);
        assertEquals(0, student.getGradeAverage(), 0);

        student.addGrade(100);
        assertEquals("Check if average is returned", 50, student.getGradeAverage(), 0);
    }

    @Test
    public void testUpdateGrade() {
        Student student = new Student(1L, "Shelby");

        student.addGrade(70);
        student.updateGrade(0, 90);
        assertEquals(90, student.getGrades().get(0), 0);

        student.addGrade(90);
        student.updateGrade(1, 70);
        assertEquals(70, student.getGrades().get(1), 0);
    }

    @Test
    public void testDeleteGrade() {
        Student student = new Student(1L, "Shelby");
        student.addGrade(100);
        student.addGrade(100);
        student.deleteGrade(0);
        assertEquals(1, student.getGrades().size());
    }
















}
