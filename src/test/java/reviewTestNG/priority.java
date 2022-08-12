package reviewTestNG;

import org.testng.annotations.Test;

public class priority {


    @Test(priority = 2)
    public  void Atest(){
        System.out.println("i am Atest");
}
    @Test(priority = 3)
    public  void Btest(){
        System.out.println("i am Btest");
    }
    @Test(priority = 1)
    public  void Ctest(){
        System.out.println("i am Ctest");
    }


}
