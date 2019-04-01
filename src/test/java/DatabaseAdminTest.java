import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    Employee databaseAdmin1;

    @Before
    public void before() {
        databaseAdmin1 = new DatabaseAdmin("Jack White", "QQ1213456C", 5500);
    }

    @Test
    public void hasName() {
        assertEquals("Jack White", databaseAdmin1.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("QQ1213456C", databaseAdmin1.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(5500, databaseAdmin1.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin1.raiseSalary(250);
        assertEquals(5750, databaseAdmin1.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(55, databaseAdmin1.payBonus(), 0);
    }
}
