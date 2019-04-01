import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager1;

    @Before
    public void before() {
        manager1 = new Manager("Joe Doe", "QQ123456C", 5000, "HR");
    }

    @Test
    public void hasDeptName() {
        assertEquals("HR", manager1.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager1.raiseSalary(750);
        assertEquals(5750, manager1.getSalary(), 0);
    }


}
