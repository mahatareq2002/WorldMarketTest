import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TearDown {

    @Test
    public void tearDown(){
        SetUp.chromeDriver.quit();
    }
}

