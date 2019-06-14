import org.junit.Test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberTests {


    @Test
    public void numbersTest() {
        byte maxByte = 127;
        byte minByte = -128;
        short maxShort = 32767;
        short minShort = -32768;
        int maxInt = 2147483647;  // 10 digits, but 9 digits with any number
        int minInt = -2147483648;
        long maxLong = 9223372036854775807L;  // 19 digits, but 18 digits with any number
        long minLong = -9223372036854775808L;
    }

    @Test
    public void currencyWithNumberFormat() {
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        Currency currency = numberFormat1.getCurrency();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer format = numberFormat1.format(556465.556, stringBuffer, new FieldPosition(2));
        System.out.println(currency.getSymbol() + format.toString());
        NumberFormat numberFormat2 = NumberFormat.getNumberInstance();
        numberFormat2.setMaximumFractionDigits(2);
        System.out.println(currency.getSymbol() + numberFormat2.format(456.5654));
        NumberFormat numberFormat3 = NumberFormat.getNumberInstance(Locale.FRANCE);
        String frenchCurrencySymbol = currency.getSymbol(Locale.FRANCE);
        numberFormat3.setMaximumFractionDigits(2);
        //this does not work correctly
        System.out.println(frenchCurrencySymbol + numberFormat3.format(456.4564));
        NumberFormat currency1 = NumberFormat.getCurrencyInstance();
        String format1 = currency1.format(456.235);
        System.out.println(format1);
        NumberFormat currency2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(currency2.format(456.456));
        NumberFormat currency3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(currency3.format(456.456));
        Locale locale = new Locale("en", "in");
        NumberFormat currency4 = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currency4.format(45.4566));
    }
}
