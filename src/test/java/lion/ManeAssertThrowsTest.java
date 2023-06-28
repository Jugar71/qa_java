package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ManeAssertThrowsTest {
    @Mock
    Feline felineMock;

    @Test(expected = Exception.class)
    public void maneAssertThrowsExceptionTest() throws Exception {
        Lion lion = new Lion("Неизвестно", felineMock);
        lion.doesHaveMane();
    }
}
