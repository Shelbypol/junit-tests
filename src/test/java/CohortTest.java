import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohort;
    Student student;

    @Before
    public void setup() {
        cohort = new Cohort();
        student = new Student(1L, "Shelby");
    }

    @Test
    public void testAddStudent() {
        assertEquals(0, cohort.getStudents().size());

        cohort.addStudent(student);
        assertEquals(1, cohort.getStudents().size(), 0);
    }


    @Test
    public void testGetStudents() {
        assertTrue(cohort.getStudents().isEmpty());

        cohort.addStudent(student);
        assertEquals(1, cohort.getStudents().size());
        assertEquals(student, cohort.getStudents().get(0));
    }

    @Test
    public void testGetCohortAverage() {
        Student student1 = new Student(1L, "Shelby");
        student1.addGrade(100);
        cohort.addStudent(student1);

        Student student2 = new Student(2L, "John");
        student2.addGrade(50);
        cohort.addStudent(student2);

        Student student3 = new Student(3L, "Tim");
        student3.addGrade(75);
        cohort.addStudent(student3);


        assertEquals(75, cohort.getCohortAverage(), 0);
    }

}
