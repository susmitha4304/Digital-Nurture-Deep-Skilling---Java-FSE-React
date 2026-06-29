import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student("John", 75);
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown completed");
        student = null;
    }

    @Test
    public void testStudentName() {

        // Arrange
        String expected = "John";

        // Act
        String actual = student.getName();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testStudentGrade() {

        // Arrange
        String expected = "Pass";

        // Act
        String actual = student.getGrade();

        // Assert
        assertEquals(expected, actual);
    }
}