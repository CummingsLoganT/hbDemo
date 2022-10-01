public class Sep22Demo {
    public static void main(String[] args) {


    }

    static double arrayMax(double[] values) {
        if (values == null || values.length == 0) {
            return 0.0;
        }

        double toReturn = values[0];
//        Alternative: double toReturn = -Double.MAX_VALUE;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > toReturn) {
                toReturn = values[i];
            }
        }

        return toReturn;
    }

}

