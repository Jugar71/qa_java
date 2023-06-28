package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensDefaultLionTests {
    @Mock
    Feline felineMock;

    @Test
    public void getKittensDefaultLionTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Assert.assertEquals("Количество львят не совпадает с эталоном", lion.getKittens(), 1);//Сравниваем
    }
}
