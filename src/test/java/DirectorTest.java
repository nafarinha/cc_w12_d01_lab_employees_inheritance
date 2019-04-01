import management.Director;
import org.junit.Before;
import org.junit.Test;

public class DirectorTest {

    Director director1;

    @Before
    public void before() {
        director1 = new Director("Jonathan Davidson", "QR123456X", 10000, "Admin", 1000000);
    }
}
