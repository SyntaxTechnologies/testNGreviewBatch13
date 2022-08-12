package reviewTestNG;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void Alogin(){
        System.out.println("i am a beautiful test");
        System.out.println(0/0);

    }

    @Test()
    public void DashBoardPage(){

        System.out.println("i am a beautiful dashboardPage");
    }
}
