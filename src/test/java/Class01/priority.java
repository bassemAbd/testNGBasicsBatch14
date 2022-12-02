package Class01;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 1)
    public void Atest(){

        System.out.println(" i am A test");
    }

    @Test (priority = 3, groups = "regression")
    public void Btest(){
        System.out.println(" i am B test");
    }
    @Test(priority = 2)
    public void Ctest(){
        System.out.println(" i am C test");
    }
    @Test
    public void Dtest(){
        System.out.println(" i am D test");
    }
}
