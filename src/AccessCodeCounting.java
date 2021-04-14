import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccessCodeCounting
{
    @Test
    public void ShouldCountLuckyTriplesInListOfZeroNumbers()
    {
        int[] accessCodes = {};
        int expectedLuckyTripleCount = 0;
        int actualAnswer = Solution.CountLuckyTriples(accessCodes);
        Assertions.assertEquals(expectedLuckyTripleCount, actualAnswer);
    }
    @Test
    public void ShouldCountLuckyTriplesInListOfTwoOnes()
    {
        int[] accessCodes = {1,1};
        int expectedLuckyTripleCount = 0;
        int actualAnswer = Solution.CountLuckyTriples(accessCodes);
        Assertions.assertEquals(expectedLuckyTripleCount, actualAnswer);
    }
    @Test
    public void ShouldCountLuckyTriplesInListOfThreeOnes()
    {
        int[] accessCodes = {1,1,1};
        int expectedLuckyTripleCount = 1;
        int actualAnswer = Solution.CountLuckyTriples(accessCodes);
        Assertions.assertEquals(expectedLuckyTripleCount, actualAnswer);
    }
    @Test
    public void ShouldCountLuckyTriplesInListOfFourOnes()
    {
        int[] accessCodes = {1,1,1,1};
        int expectedLuckyTripleCount = 4;
        int actualAnswer = Solution.CountLuckyTriples(accessCodes);
        Assertions.assertEquals(expectedLuckyTripleCount, actualAnswer);
    }
    @Test
    public void ShouldCountLuckyTriplesInListOfSixNumbers()
    {
        int[] accessCodes = {1,2,3,4,5,6};
        int expectedLuckyTripleCount = 3;
        int actualAnswer = Solution.CountLuckyTriples(accessCodes);
        Assertions.assertEquals(expectedLuckyTripleCount, actualAnswer);
    }
}
