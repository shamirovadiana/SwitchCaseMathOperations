import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        double firstValue = scanner.nextDouble();
        System.out.println("Введите второе число :");
        double secondValue = scanner.nextDouble();
        System.out.println("Выберите операцию :\n1.Сложение\n2.Вычитание\n3.Умножение\n4.Деление");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Результат сложения введённых чисел : " + sum(firstValue, secondValue));
                break;
            case 2:
                System.out.println("Результат вычитания введённых чисел : " + subtraction(firstValue, secondValue));
                break;
            case 3:
                System.out.println("Результат умножения введённых чисел : " + multiplication(firstValue, secondValue));
                break;
            case 4:
                System.out.println("Результат деления введённых чисел : " + division(firstValue, secondValue));
                break;
            default:
                System.out.println("Вы ввели неверную операцию!");
        }

    }

    public static double sum(double value1, double value2){
        return value1 + value2;
    }

    public static double subtraction(double value1, double value2){
        return value1 - value2;
    }

    public static double multiplication(double value1, double value2){
        return value1 * value2;
    }

    public static double division(double value1, double value2){
        return value1 / value2;
    }
}
