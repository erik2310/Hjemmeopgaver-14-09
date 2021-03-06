public class Main {

    public static void main(String[] args) {

        final Object[][] table = new String[5][];
        table[0] = new String[] { "a", "a^2", "a^3", "a^4" };
        table[1] = new String[] { "1" ,"1", "1", "1" };
        table[2] = new String[] { "2" ,"4", "8", "16" };
        table[3] = new String[] { "3" ,"9", "27", "81" };
        table[4] = new String[] { "4" ,"16", "64", "256" };

        for (final Object[] row : table) {
            System.out.format("%12s%12s%12s%12s\n", row);
        }

    }

}
