package ru.netology.businessServicemvn.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldGetTotalSumEqualExpected() {

        int expected = 180;
        int actual = service.getTotalSum(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldGetAverage() {
        int expected = 15;
        int actual = service.getAverageSum(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldGetMaxSaleMonth() {
        int expected = 8;
        int actual = service.getMaxSaleMonth(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldGetMinSaleMonth() {
        int expected = 9;
        int actual = service.getMinSaleMonth(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldGetLowAverageMonthCount() {
        int expected = 5;
        int actual = service.getLowAverageMonthCount(sales);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldGetHighAverageMonthCount() {
        int expected = 5;
        int actual = service.getHighAverageMonthCount(sales);
        Assertions.assertEquals(actual, expected);
    }
}
