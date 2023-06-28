package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Еда не совпадает с эталоном", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());//Сравниваем
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Семейство не совпадает с эталоном", "Кошачьи", feline.getFamily());//Сравниваем
    }

    @Test
    public void getKittensDefaultFelineTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Количество котят не совпадает с эталоном", 1, feline.getKittens());//Сравниваем
    }

    @Test
    public void getKittensFelineTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Количество котят не совпадает с эталоном", 5, feline.getKittens(5));//Сравниваем
    }
}
