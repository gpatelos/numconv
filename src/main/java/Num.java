public class Num {


    private static final String[] onesNames = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tensNames = {
            "err", "dblErr", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] bigNames = {
            "Thousand", "Million", "Billion"
    };


    public static String convertNumberToWords(int n) {
        if (n < 0) {
            return "Minus " + convertNumberToWords(-n);
        }
        if (n <= 999) {
            return parse999(n);
        }
        String s = null;
        int t = 0;
        while (n > 0) {
            if (n % 1000 != 0) {
                String s2 = parse999(n % 1000);
                if (t > 0) {
                    s2 = s2 + " " + bigNames[t - 1];
                }
                if (s == null) {
                    s = s2;
                } else {
                    s = s2 + ", " + s;
                }
            }
            n /= 1000;
            t++;
        }
        return s;
    }

    // Range 0 to 999
    private static String parse999(int n) {
        String s1 = onesNames[n / 100] + " Hundred";
        String s2 = parse99(n % 100);
        if (n <= 99) {
            return s2;
        } else if (n % 100 == 0) {
            return s1;
        } else {
            return s1 + " " + s2;
        }
    }

    // Range 0 to 99.
    private static String parse99(int n) {
        if (n < 20) {
            return onesNames[n];
        }
        String s = tensNames[n / 10];
        if (n % 10 == 0) {
            return s;
        }
        return s + "-" + onesNames[n % 10];
    }


}
