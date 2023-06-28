package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    Feline felineMock;

    @Test
    public void getFoodCatTest() throws Exception {
        Cat cat = new Cat(felineMock);
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Еда не совпадает с эталоном", List.of("Животные", "Птицы", "Рыба"), cat.getFood());//Сравниваем
    }

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(felineMock);
        Assert.assertEquals("Звук не совпадает с эталоном", "Мяу", cat.getSound());//Сравниваем
    }
}
