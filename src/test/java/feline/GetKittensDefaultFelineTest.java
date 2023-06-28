package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetKittensDefaultFelineTest {
    @Test
    public void getKittensDefaultFelineTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Количество котят не совпадает с эталоном", feline.getKittens(), 1);//Сравниваем
    }
}
