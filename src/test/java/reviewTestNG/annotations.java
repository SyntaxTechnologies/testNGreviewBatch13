package reviewTestNG;

import org.testng.annotations.*;

public class annotations {

    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("i am before suit");
    }

    @AfterSuite
    public  void afterSuit(){
        System.out.println("i am after suit");
    }


    @BeforeTest
    public  void beforeTest(){
    System.out.println("i am before TEST");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("i am after TEST");
    }
    @BeforeClass
    public void beforeClass(){
    System.out.println("i am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i am after class");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("i am before method");
    }

    @Test
    public void Test1(){
        System.out.println("i am Test1");
    }

    @Test
    public void Test2(){
        System.out.println("i am Test2");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("i am after method");
    }
}
