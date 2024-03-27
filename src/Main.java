import arithmetic.Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Double, Long> operation = new Arithmetic<>(10.422, 100L);
        System.out.println(operation.getMin());
    }
}
