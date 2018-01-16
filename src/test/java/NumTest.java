import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumTest {

    @Test
    public void convertNumbersToWordsTest() {

        Assert.assertEquals("Ten Thousand, One Hundred Eighty-Three", Num.convertNumberToWords(10183));
        Assert.assertEquals("Eight Hundred",Num.convertNumberToWords(800));
        Assert.assertEquals("One Thousand, Three Hundred Nineteen",Num.convertNumberToWords(1319));
        Assert.assertEquals("One Million", Num.convertNumberToWords(1000000));
        Assert.assertEquals("Two Million", Num.convertNumberToWords(2000000));
        Assert.assertEquals("Three Million, Two Hundred", Num.convertNumberToWords(3000200));
        Assert.assertEquals("Seven Hundred Thousand", Num.convertNumberToWords(700000));
        Assert.assertEquals("Nine Million", Num.convertNumberToWords(9000000));
        Assert.assertEquals("Nine Million, One Thousand", Num.convertNumberToWords(9001000));
        Assert.assertEquals("One Hundred Twenty-Three Million, Four Hundred Fifty-Six Thousand, Seven Hundred Eighty-Nine", Num.convertNumberToWords(123456789));
        Assert.assertEquals("Two Billion, One Hundred Forty-Seven Million, Four Hundred Eighty-Three Thousand, Six Hundred Forty-Seven", Num.convertNumberToWords(2147483647));

    }
}