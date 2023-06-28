package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class GetSoundTest {
    private final String sound;

    public GetSoundTest(String sound) {
        this.sound = sound;
    }

    @Parameterized.Parameters
    public static Object[][] testCases() {
        return new Object[][] {
                { "Мяу"},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(felineMock);
        Assert.assertEquals("Звук не совпадает с эталоном", cat.getSound(), sound);//Сравниваем
    }
}
