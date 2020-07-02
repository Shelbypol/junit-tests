import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohort;
    Student student;
    Student student1;
    Student student2;
    Student student3;

    @Before
    public void setup() {
        cohort = new Cohort();
        student = new Student(0L, "Shelby");

        student1 = new Student(1L, "Shelby");
        student1.addGrade(100);
        cohort.addStudent(student1);

        student2 = new Student(2L, "John");
        student2.addGrade(50);
        cohort.addStudent(student2);

        student3 = new Student(3098, "Tim");
        student3.addGrade(75);
        cohort.addStudent(student3);
    }

    @Test
    public void testAddStudent() {
        assertFalse(cohort.getStudents().isEmpty());

        cohort.addStudent(student);
        assertEquals(4, cohort.getStudents().size(), 0);
    }

    @Test
    public void testGetStudents() {
        assertEquals(3, cohort.getStudents().size());
        assertSame(student1, cohort.getStudents().get(0));
        assertSame(student2, cohort.getStudents().get(1));
        assertSame(student3, cohort.getStudents().get(2));
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(75, cohort.getCohortAverage(), 0);
    }

    @Test
    public void testFindStudentById() {
        assertEquals("John", cohort.findStudentById(2));
        assertEquals("Shelby", cohort.findStudentById(1));
        assertEquals("Tim", cohort.findStudentById(3098));
    }

}
