package b;

import org.testng.annotations.Test;

public class B extends a.Base {
    @Test
    public void testB() {
        System.out.println("Test: B#testB");
    }

    @Test(dependsOnMethods = {"testB"})
    public void dependsOnTestB() {
        System.out.println("Test: B#dependsOnTestB");
    }
}
