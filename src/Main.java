import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length;
        int width;
        int height;
        int volume;
        int surfaceArea;

        System.out.print("Введите значение длины: ");
        length = scanner.nextInt();
        System.out.print("Введите значение ширины: ");
        width = scanner.nextInt();
        System.out.print("Введите значение высоты: ");
        height = scanner.nextInt();

        volume = length * width * height;
        System.out.println("Объем = " + volume);

        surfaceArea = 2 * (length * width + length * height + width * height);
        System.out.println("Площадь поверхности = "+surfaceArea);
    }
}