package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GetKittensFelineTest {
    private final int expected;
    private final int actual;

    public GetKittensFelineTest(int expected, int actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Object[][] testCases() {
        return new Object[][] {
                { 3, 3 },
                { 5, 5 },
        };
    }

    @Test
    public void getKittensFelineTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Количество котят не совпадает с эталоном", feline.getKittens(actual), expected);//Сравниваем
    }
}
