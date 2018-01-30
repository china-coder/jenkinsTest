import org.junit.Assert;
import org.junit.Test;

/**
 * @Project:jenkinsTest
 * @Package Name:PACKAGE_NAME
 * @Description:TODO
 * @Author:chenjun
 * @Creation Date:2018年01月30日
 * ModificationHistory    who      when    what
 */
public class MainTest {
    @Test
    public void testOne(){
        Assert.assertEquals(1,2);
        System.out.println("haha");
    }
    @Test
    public void testTow(){
        Assert.assertEquals(2,2);
        System.out.println("haha");
    }
    @Test
    public void testThree(){
        Assert.assertEquals(10,21);
    }
}
