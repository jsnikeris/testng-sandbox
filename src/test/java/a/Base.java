package a;

import org.testng.annotations.AfterClass;

public class Base {
    @AfterClass
    public void cleanup() {
        System.out.println(String.format("AfterClass: %s#cleanup",
                                         getClass().getSimpleName()));
    }
}
