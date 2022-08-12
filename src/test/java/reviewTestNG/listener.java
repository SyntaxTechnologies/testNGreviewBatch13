package reviewTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("hola the test is successfull :"+result.getName());
    }

    @Override
    public  void onTestFailure(ITestResult result){
        System.out.println("The test case has failed successfully :"+result.getName());
    }
}
