public class Example1 {
    public static <T> void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }
    public static void main(String args[]) {
        swap(10, 15);
        swap("hello","world");
        swap(35.00,23.65);
        swap(267366667,5479813);
    }
}