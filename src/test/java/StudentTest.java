import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        this.student = new Student(324, "shelby");
        student.addGrade(50);
        student.addGrade(100);
        student.addGrade(80);
        student.updateGrade(0, 70);
        student.updateGrade(2, 90);
        student.deleteGrade(1);
    }

    @Test
    public void testConstructor() {
        assertEquals("Check if name is in the Constructor", "shelby", student.getName());
        assertEquals("Check if 'id' is in the Constructor", 324, student.getId());
        assertEquals("Check if size of the grades array matches", 2, student.getGrades().size());
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals("Check if average is returned", 75, student.getGradeAverage(), 0);
    }

    @Test
    public void testUpdateGrade(){
        assertTrue(70 == student.getGrades().get(0));
        assertTrue(90 == student.getGrades().get(2));
    }

    @Test
    public void testDeleteGrade(){
        assertTrue(2 == student.getGrades().size());
    }


}
