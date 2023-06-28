package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class DoesHaveManeTest {
    private final String sex;
    private final boolean mane;

    public DoesHaveManeTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] testCases() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}, //был ещё вариант с получением эксепшена, но тогда отчёт jacoco не генерится
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, felineMock);
        Assert.assertEquals("Наличие/отсутствие гривы не совпадает с ожиданием", lion.doesHaveMane(), mane);//Сравниваем
    }
}
