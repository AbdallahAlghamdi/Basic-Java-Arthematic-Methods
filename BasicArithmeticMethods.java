public class BasicArithmeticMethods {

    public static void Addon(int[] arr) { // adds 1 to every element in an Int array
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }

    }

    public static int DivideDoubleToInt(double x, double y) { //divides two numbers and forces them into being a whole integer.
        return (int) (x / y);

    }

    public static int addbetweenie(int x, int y) { //adds all the numbers between the the two given numbers, inclusive of both ends.
        if (y > x) {
            int temp;
            temp = x;
            x = y;
            y = temp;
        }
        int sum = 0;
        for (int i = y; i <= x; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int x = 12;
        int y = 12;
        System.out.println(addbetweenie(x,y));

    }
}


//one two three two three done