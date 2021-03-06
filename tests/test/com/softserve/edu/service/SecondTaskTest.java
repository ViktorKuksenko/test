package test.com.softserve.edu.service;

import com.softserve.edu.service.SecondTask;
import com.softserve.edu.service.SumOfSquares;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondTaskTest {
    private static SecondTask task = null;

    @DataProvider(name = "testCheckSumOfOnePairOfSquares")
    public static Object[][] checkSumOfOnePairOfSquares() {
        return new Object[][] {
                {new SumOfSquares(0, 0, 67), 67},
                {new SumOfSquares(21, 1, 442), 442},
        };
    }

    @DataProvider(name = "testCheckSumOfAllPairsOfSquares")
    public static Object[][] checkSumOfAllPairsOfSquares() {
        return new Object[][] {
                {new ArrayList<>(Arrays.asList(new SumOfSquares(0, 0, 76))), 76},
                {new ArrayList<>(Arrays.asList(new SumOfSquares(11, 1, 122))), 122},
                {new ArrayList<>(Arrays.asList(new SumOfSquares(98, 86,17000),
                        new SumOfSquares(110, 70, 17000), new SumOfSquares(122, 46,17000),
                        new SumOfSquares(130, 10, 17000))), 17000}
        };
    }

    @DataProvider(name = "checkSumOfSquaresNegative")
    public static Object[][] checkSumOfSquaresNegative() {
        return new Object[][] {
                {0},
                {-122}
        };
    }

    @BeforeClass
    public void setUpBeforeClass() {
        task = new SecondTask();
    }

    @Test(dataProvider = "testCheckSumOfOnePairOfSquares")
    public void testCalculationOnePairXAndYWhichSatisfiesTheCondition1(SumOfSquares expected, Integer actual) {
        Assert.assertEquals(expected, task.calculationOnePairXAndYWhichSatisfiesTheCondition(actual));
    }

    @Test(dataProvider = "testCheckSumOfAllPairsOfSquares")
    public void testCalculationAllPairsXAndYWhichSatisfiesTheCondition1(List<SumOfSquares> expected, Integer actual) {
        Assert.assertEquals(expected, task.calculationAllPairsXAndYWhichSatisfiesTheCondition(actual));
    }

    @Test(dataProvider = "checkSumOfSquaresNegative", expectedExceptions = IllegalArgumentException.class)
    public void testCalculationAllPairsXAndYWhichSatisfiesTheConditionNegative(Integer actual) {
        task.calculationAllPairsXAndYWhichSatisfiesTheCondition(actual);
    }

    @Test(dataProvider = "checkSumOfSquaresNegative", expectedExceptions = IllegalArgumentException.class)
    public void  testCalculationOnePairXAndYWhichSatisfiesTheConditionNegative(Integer actual) {
        task.calculationOnePairXAndYWhichSatisfiesTheCondition(actual);
    }
}
