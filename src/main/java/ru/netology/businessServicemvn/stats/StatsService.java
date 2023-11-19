package ru.netology.businessServicemvn.stats;

public class StatsService {
    public int getTotalSum(int[] sales) {
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum = totalSum + sales[i];
        }
        return totalSum;
    }

    public int getAverageSum(int[] sales) {
        int averageSum = 0;
        int totalSum = getTotalSum(sales);
        averageSum = totalSum / sales.length;
        return averageSum;
    }

    public int getMaxSaleMonth(int[] sales) {
        int maxSale = sales[0];
        int maxMonth = 1;
        int curMonth = 0;
        for (int sale : sales) {
            curMonth++;
            if (sale >= maxSale) {
                maxSale = sale;
                maxMonth = curMonth;
            }
        }
        return maxMonth;
    }

    public int getMinSaleMonth(int[] sales) {
        int minSale = sales[0];
        int minMonth = 1;
        int curMonth = 0;
        for (int sale : sales) {
            curMonth++;
            if (sale <= minSale) {
                minSale = sale;
                minMonth = curMonth;
            }
        }
        return minMonth;
    }

    public int getLowAverageMonthCount(int[] sales) {
        int monthCount = 0;
        int averageSum = getAverageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int getHighAverageMonthCount(int[] sales) {
        int monthCount = 0;
        int averageSum = getAverageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
