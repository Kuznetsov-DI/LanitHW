import model.Math;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MathTest {

    @DataProvider
    public Object[][] testSum() {
        return new Object[][]{
                {2,1,1},
                {10,5,5}
        };
    }

    @DataProvider
    public Object[][] testDivision() {
        return new Object[][]{
                {1,2,1},
                {5,10,5}
        };
    }

    @DataProvider
    public Object[][] testMultiplication() {
        return new Object[][]{
                {1,1,1},
                {25,5,5}
        };
    }

    @DataProvider
    public Object[][] testSubtraction() {
        return new Object[][]{
                {1,1,1},
                {2,10,5}
        };
    }
    @Test (dataProvider = "testSum")
    public void testSum (int one, int two, int three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.sum(), "Значение не равны!");
    }

    @Test (dataProvider = "testDivision")
    public void testDivision (int one, int two, int three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.division(), "Значение не равны!");
    }

    @Test (dataProvider = "testMultiplication")
    public void testMultiplication (int one, int two, int three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.multiplication(), "Значение не равны!");
    }

    @Test (dataProvider = "testSubtraction")
    public void testSubtraction (int one, int two, int three){
        Math m = new Math(two,three);
        Assert.assertEquals(one, m.subtraction(), "Значение не равны!");
    }
}
