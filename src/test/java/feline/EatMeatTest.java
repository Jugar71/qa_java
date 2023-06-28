package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class EatMeatTest {
    private final List<String> food;

    public EatMeatTest(List<String> food) {
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] testCases() {
        return new Object[][] {
                { List.of("Животные", "Птицы", "Рыба") },
        };
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Еда не совпадает с эталоном", feline.eatMeat(), food);//Сравниваем
    }
}
