import org.junit.Test;
import org.junit.Assert.*;

import java.util.Random;

public class DodawanieTest {

    @Test
    public void test1(){
        org.junit.Assert.assertEquals("0", DodawanieLib.dodaj("0","0"));
    }
    @Test
    public void test2(){
        org.junit.Assert.assertEquals("2", DodawanieLib.dodaj("1","1"));
    }

    @Test
    public void test3(){
        Random r = new Random();
        for(int i = 0;i<100;i++){
            int a = r.nextInt(1000);
            int b = r.nextInt(1000);

            org.junit.Assert.assertEquals(Integer.toString(a+b), DodawanieLib.dodaj(Integer.toString(a),Integer.toString(b)));
        }
    }

}
