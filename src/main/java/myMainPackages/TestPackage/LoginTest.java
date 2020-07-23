package myMainPackages.TestPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    
    @BeforeMethod
    public void before() {
        System.out.println("before method");
    }

    @BeforeTest
    public void start() {
        System.out.println("test start");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}
