import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director1;

    @Before
    public void before() {
        director1 = new Director("Jonathan Davidson", "QR123456X", 10000, "Admin", 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Jonathan Davidson", director1.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("QR123456X", director1.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(10000, director1.getSalary(), 0);
    }


    @Test
    public void hasDeptName() {
        assertEquals("Admin", director1.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director1.raiseSalary(2075);
        assertEquals(12075, director1.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals((100), director1.payBonus(), 0.01);
    }
}
