package reviewTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
//    write a test case in which u test
//    login fucntionality with
//    4 different crdentials

    @DataProvider(name = "myData")
    public Object [][]data(){
        Object[][]login={

                { "Admin","12345","Invalid credentials"},
                {"ABCD","Hum@nhrm123","Invalid credentials"},
                {"Admin","","Password cannot be empty"},
                {"","Hum@nhrm123","Username cannot be empty"}};
        return login;

        }

    @Test(dataProvider = "myData")
    public void loginCredentialTestcase(String usrName, String pswrd, String error){

        System.out.println("userName :"+usrName);
        System.out.println("Password :"+pswrd);
        System.out.println("error :"+error);


    }
}
