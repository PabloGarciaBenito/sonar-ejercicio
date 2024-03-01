package training.maven.quick;

public class HolaMundo{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
    public int addition(final int firstNumber, final int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(final int firstNumber, final int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(final int firstNumber, final int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(final int firstNumber, final int secondNumber) {
        return firstNumber / secondNumber;
    }
}