public class Multiples {

    public static void main(String[] args) {
        int numMultiples = 0;

        for (int i = 1; i < 10; i++) {
            boolean isMultiple3 = i % 3 == 0;
            boolean isMultiple5 = i % 5 == 0;

            if (isMultiple3 || isMultiple5) {
                numMultiples++;
            }
        }

        System.out.println(numMultiples);
    }
}
