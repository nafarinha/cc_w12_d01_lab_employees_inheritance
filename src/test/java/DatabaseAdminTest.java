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
}
