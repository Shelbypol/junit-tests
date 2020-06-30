import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student shelby = new Student(324, "shelby");

    @Before
    public void setUp() {
        shelby.addGrade(34);
    }

//    @Test
//    public void testName() {
//        assertEquals(name, Student.name);
//    }
//
//    @Test
//    public void testId() {
//        assertEquals(id, Student.id);
//    }

    @Test
    public void testGrade(){
        assertEquals(1, shelby.getGrades().size());

    }

}
