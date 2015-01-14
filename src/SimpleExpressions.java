public class SimpleExpressions {
    public static void main (String[] args) {
        int counter = 10;
        double termperature = 98.6; // Assume Fahrenheit scale
        String firstName = "Mark"; // Strings use double quotes
        int[] ages = { 52, 28 ,93, 16 };
        char gradeLetters[] = { 'A', 'B', 'C', 'D', 'F' }; // chars use single quotes
        float[][] matrix = {
            { 1.0F, 2.0F, 3.0F },
            { 4.0F, 5.0F, 6.0F }
        };
        int x = 1, y[] = { 1, 2, 3 }, z = 3;
        double p = 3.14159;
        System.out.println(counter);
        System.out.println(termperature);
        System.out.println(firstName);
        System.out.println(ages.length);
        System.out.println(gradeLetters.length);
        System.out.println(matrix.length);
        System.out.println(x);
        System.out.println(y.length);
        System.out.println(z);
        System.out.println(p);

        int counter2;
        counter2 = counter;
        System.out.println(counter2);

        short s = 20;
        System.out.println(s);
        int i;
        i = s;
        System.out.println(i);

        // short s2 = 40000; // possible loss of precision error
        int i2;
        i2 = i - 1;
        double d = i2;
        System.out.println(d);
    }
}
