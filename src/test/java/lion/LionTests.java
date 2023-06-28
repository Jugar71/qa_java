package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline felineMock;

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Еда не совпадает с эталоном", List.of("Животные", "Птицы", "Рыба"), lion.getFood());//Сравниваем
    }

    @Test
    public void getKittensDefaultLionTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Assert.assertEquals("Количество львят не совпадает с эталоном", 1, lion.getKittens());//Сравниваем
    }

    @Test(expected = Exception.class)
    public void maneAssertThrowsExceptionTest() throws Exception {
        Lion lion = new Lion("Неизвестно", felineMock);
        lion.doesHaveMane();
    }
}
