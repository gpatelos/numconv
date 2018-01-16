import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutesTest {

    @Test
    public void getPermTest(){
        Permutes perm = new Permutes();

        String expected = "ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA";
        String actual = perm.getPerm("ABGS");

        Assert.assertEquals(expected,actual);
    }
}