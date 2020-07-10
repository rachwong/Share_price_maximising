package service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SharePriceServiceTest {
    private SharePriceService sharePriceService;

    @Before
    public void setUp() {
        sharePriceService = new SharePriceService();
    }

    @Test
    public void can_test_for_example_case_where_profit_is_6_from_email_instructions() {
        final int[] sharePrice = {10, 7, 5, 8, 11, 9};
        int expected = 6;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }

    @Test
    public void can_test_for_example_case_where_array_is_all_0() {
        final int[] sharePrice = {0, 0, 0, 0};
        int expected = 0;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }

    @Test
    public void can_test_for_example_case_where_no_profit_made_all_value_same() {
        final int[] sharePrice = {10, 10, 10, 10, 10, 10};
        int expected = 0;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }

    @Test
    public void can_test_for_example_case_where_negative_profit() {
        final int[] sharePrice = {9, 8, 7, 6};
        int expected = 0;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }

    @Test
    public void can_test_for_example_case_where_positive_profit() {
        final int[] sharePrice = {100,200,300,400,500,600,700,800,1000};
        int expected = 900;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }

    @Test
    public void can_test_for_example_case_where_array_has_very_large_numbers() {
        final int[] sharePrice = {2147483647, 1, 2147483647, 2147483647};
        int expected = 2147483646;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }

    @Test
    public void can_test_for_example_case_where_array_has_very_large_numbers_decreasing() {
        final int[] sharePrice = {2147483647, 2147483646, 2147483645, 2147483644};
        int expected = 0;
        final int maxProfit = sharePriceService.getMaxProfit(sharePrice);
        assertThat(maxProfit, is(expected));
    }
}
