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
        student.updateGrade(1, 60);
        int num = 60;
        assertTrue(num == student.getGrades().get(1));
    }



}
