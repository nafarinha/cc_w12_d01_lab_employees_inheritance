import Management.Manager;
import Staff.Employee;
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
        assertEquals("QQ123456C", employee1.getnINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(5000, employee1.getSalary(), 0);
    }
}
