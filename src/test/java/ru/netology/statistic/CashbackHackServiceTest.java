package ru.netology.statistic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100For900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected, "Для суммы 900 должны советовать докупить 100");
    }

    @Test
    public void shouldReturn0For1000() {  // этот тест упадёт из-за ошибки
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Для суммы 1000 докупать ничего не нужно");
    }

    @Test
    public void shouldReturn500For1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected, "1500 -> остаток 500");
    }

    @Test
    public void shouldReturn0For2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(actual, expected, "2000 -> остаток 0");
    }
}