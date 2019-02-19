import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void tossAndSumTest(){
        //Given
        Dice dice = new Dice(2);
        Integer expected = dice.getNumberOfDice()*6;
        Boolean answer = false;


        //When
        Integer actual = dice.tossAndSum();

        if(actual <= expected) {
            answer = true;
        }


        //Then
        Assert.assertTrue(answer);
    }
}
