package Class01;

import org.testng.annotations.Test;

public class enableDisable {

    @Test (enabled = false)
    public void ATest(){
        System.out.println("i am A test");
    }

    @Test
    public void BTest(){
        System.out.println("i am B Test");
    }

    @Test (enabled = false)
    public void CTest(){
        System.out.println("i am C Test");
    }
}
