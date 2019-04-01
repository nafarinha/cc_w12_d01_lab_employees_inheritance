import management.Manager;
import staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee1;

    @Before
    public void before() {
        employee1 = new Manager("Joe Doe", "QQ123456C", 5000, "HR");
    }

    @Test
    public void hasName() {
        assertEquals("Joe Doe", employee1.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("QQ123456C", employee1.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(5000, employee1.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary() {
        employee1.raiseSalary(100);
        assertEquals(5100, employee1.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary__fixNegativeAmountTypo() {
        employee1.raiseSalary(-1000);
        assertEquals(6000, employee1.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(50, employee1.payBonus(), 0);
    }
}
