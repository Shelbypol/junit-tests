import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student(1L, "Shelby");
        student.addGrade(50); //70
        student.addGrade(100);
        student.addGrade(75); //90
        student.updateGrade(0, 70);
        student.updateGrade(2, 90);
        student.deleteGrade(1);
    }


    @Test
    public void testConstructor() {
        assertEquals("Check if name is in the Constructor", "Shelby", student.getName());
        assertEquals("Check if 'id' is in the Constructor", 1L, student.getId());
        assertFalse("Check if size of the grades array matches", student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
        assertEquals(2, student.getGrades().size());

        student.addGrade(99);
        assertEquals(3, student.getGrades().size());
//        assertEquals(100, student.getGrades().get(1), 0);
    }

    @Test
    public void testGetGradeAverage() {
        assertEquals("Check if average is returned", 80, student.getGradeAverage(), 0);
    }

    @Test
    public void testUpdateGrade() {
        student.updateGrade(0, 90);
        assertEquals(90, student.getGrades().get(0), 0);


        student.updateGrade(1, 70);
        assertEquals(70, student.getGrades().get(1), 0);
    }

    @Test
    public void testDeleteGrade() {
        student.deleteGrade(0);
        assertEquals(1, student.getGrades().size());
    }


}
