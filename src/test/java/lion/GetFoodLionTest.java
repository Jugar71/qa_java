package lion;

import com.example.Feline;
import com.example.Lion;
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
public class GetFoodLionTest {
    private final List<String> food;

    public GetFoodLionTest(List<String> food) {
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
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Еда не совпадает с эталоном", lion.getFood(), food);//Сравниваем
    }
}
