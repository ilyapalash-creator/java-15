package ru.netology.statistic;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100For900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals("Для суммы 900 должны советовать докупить 100", expected, actual);
    }

    @Test
    public void shouldReturn0For1000() {  // падающий тест
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals("Для суммы 1000 докупать ничего не нужно", expected, actual);
    }

    @Test
    public void shouldReturn500For1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals("1500 -> остаток 500", expected, actual);
    }

    @Test
    public void shouldReturn0For2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals("2000 -> остаток 0", expected, actual);
    }
}