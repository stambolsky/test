package ru.csssr.blog;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class FirstTest extends TestBase{

    @Test
    public void checkCheckbox() throws InterruptedException {
        WebElement tabFind = driver.findElement(By.cssSelector("div.graphs-errors a"));
        tabFind.click();
        Thread.sleep(1000);
        tabFind.click();
        Thread.sleep(3000);
        String blockInfoErrors = driver.findElement(By.className("info-errors")).getCssValue("display");
        //Проверка на видимость блока НАХОДИТЬ НЕСОВЕРШЕНСТВА с контентом
        assertEquals(blockInfoErrors, "block");
        //Тест падает, так как баг - контент не отображается
    }


}
