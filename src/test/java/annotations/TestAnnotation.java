package annotations;

import org.testng.annotations.*;

public class TestAnnotation {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("i am before suit _");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("i am after suit -_-");
    }

    @BeforeTest
    public void BT() {

        System.out.println("i am before Test-----------------");
    }
        @AfterTest

        public void AT(){
            System.out.println("i am after Test-----------------");

        }
    }

