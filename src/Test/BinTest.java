import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    @Test
    public void binTest(){
        //Given
        Bins bin = new Bins(2,12);
        Integer expected = 0;

        //When
        Integer actual = bin.getBins(3);


        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void incrementBinsTest(){
        //Given
        Bins bin = new Bins(2,12);
        Integer expected = 1;


        //When
        bin.incrementBin(2);
        Integer actual = bin.getBins(2);

        //Then
        Assert.assertEquals(expected,actual);
    }
}
