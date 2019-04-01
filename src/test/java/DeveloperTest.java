import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Employee developer1;

    @Before
    public void before() {
        developer1 = new Developer("John Smith", "QQ123456C", 4000);
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", developer1.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("QQ123456C", developer1.getnINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(4000, developer1.getSalary(), 0);
    }
}
