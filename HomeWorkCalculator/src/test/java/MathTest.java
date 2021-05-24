import exception.DivisionByZero;
import service.Math;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MathTest {

    @DataProvider
    public Object[][] testSum() {
        return new Object[][]{
                {0,-1,1},
                {-5,-10,5},
                {0,1.5,-1.5},
                {8.9,1.2,7.7},
                {-6.5,1.2,-7.7}
        };
    }

    @DataProvider
    public Object[][] testDivision() {
        return new Object[][]{
                {0,1,1},
                {-3,2,5},
                {1.75,4,2.25},
                {0,0.3,0.3},
                {-4.3,0.3,4.6}
        };
    }

    @DataProvider
    public Object[][] testMultiplication() {
        return new Object[][]{
                {0,1,0},
                {-25,5,-5},
                {2.25,1.5,1.5},
                {0,2.123,0},
                {20,-4,-5}
        };
    }

    @DataProvider
    public Object[][] testSubtraction() {
        return new Object[][]{
                {1,1,1},
                {0,0,5},
                {-1.5,-2.25,1.5},
                {0.3,-0.9,-3}
        };
    }

    @DataProvider
    public Object[][] testSubtractionNegative() {
        return new Object[][]{
                {1.5,0},
                {0,0},
                {-2.25,0}
        };
    }

    @Test (dataProvider = "testSum")
    public void testSum (double one, double two, double three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.sum(), "Значение не равны!");
    }

    @Test (dataProvider = "testDivision")
    public void testSubtraction (double one, double two, double three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.subtraction(), "Значение не равны!");
    }

    @Test (dataProvider = "testMultiplication")
    public void testMultiplication (double one, double two, double three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.multiplication(), "Значение не равны!");
    }

    @Test (dataProvider = "testSubtraction")
    public void testDivision (double one, double two, double three) throws DivisionByZero {
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.division(), "Значение не равны!");
    }

    @Test (
            dataProvider = "testSubtractionNegative",
            expectedExceptions = DivisionByZero.class,
            expectedExceptionsMessageRegExp = "На ноль делить нельзя!"
    )
    public void testDivisionNegative (double two, double three) throws DivisionByZero {
        Math m = new Math(two,three);
        m.division();
    }
}
