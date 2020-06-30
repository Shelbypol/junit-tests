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
    }

    @Test
    public void testName() {
        assertEquals();
    }

    @Test
    public void testId() {
        assertEquals(id, Student.id);
    }

    @Test
    public void testGrade(){
        assertEquals(1, student.getGrades().size());

    }

}
