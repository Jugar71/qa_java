package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GetFamilyTest {
    private final String family;

    public GetFamilyTest(String family) {
        this.family = family;
    }

    @Parameterized.Parameters
    public static Object[][] testCases() {
        return new Object[][] {
                { "Кошачьи"},
        };
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Семейство не совпадает с эталоном", feline.getFamily(), family);//Сравниваем
    }
}
