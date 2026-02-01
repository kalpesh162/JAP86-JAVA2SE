package p1;
import static com.mylib.MathUtils.add;
import static com.mylib.MathUtils.subtract;
import static com.mylib.MathUtils.multiply;
import static com.mylib.MathUtils.divide;

public class Main {
    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));
    }
}