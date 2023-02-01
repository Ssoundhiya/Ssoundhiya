package testngconcept;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)
public class ListenersTest {

    @Test
    public void test1(){
        System.out.println("Test1");
        Assert.assertEquals(1,1);
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Test2");
    }
    @Test(timeOut = 2000)
    public void test3() throws InterruptedException {
        System.out.println("Test3");
        Thread.sleep(3000);
    }
    @Test
    public void test4(){
        System.out.println("Test4");
    }

}
