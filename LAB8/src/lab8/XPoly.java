package lab8;

public final class XPoly {

    public static final double sum(double... x) {
        double sum = 0;
        for (double i : x) {
            sum += i;
        }
        return sum;
    }

    public static final double min(double... x) {
        double min = x[0];
        for (double i : x) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static final double max(double... x) {
        double max = x[0];
        for (double i : x) {
            if (max< i) {
                max = i;
            }
        }
        return max;
    }

    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String finalString = String.join(" ", words);
        return finalString;
    }
}
