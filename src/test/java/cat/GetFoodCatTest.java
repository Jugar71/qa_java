package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class GetFoodCatTest {
    private final List<String> food;

    public GetFoodCatTest(List<String> food) {
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] testCases() {
        return new Object[][] {
                { List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test
    public void getFoodCatTest() throws Exception {
        Cat cat = new Cat(felineMock);
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Еда не совпадает с эталоном", cat.getFood(), food);//Сравниваем
    }
}
