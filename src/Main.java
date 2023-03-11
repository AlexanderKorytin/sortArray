import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FillArray fill = new FillArray();
        String str;
        Scanner scanner = new Scanner(System.in);
        SortArrayInt sortArrays = new SortArrayInt();
        // читаем строку из консоли
        System.out.println("Enter an array in the form: x x x x");
        str = scanner.nextLine();

        Integer[] mass = fill.ArrayFromString(str); // преобразуем строку в массив чисел
        int result = fill.requestСondition(); // получаем из консоли число два слагаемых которого буде искать в массиве

        Integer[] sortMass = sortArrays.sort(mass);// сортируем массив по возрастанию, выводим его на экран
        Integer[] resultMass = sortArrays.searchResult(sortMass, result);// ищем слагаемые, введенного ранее сисла
        // в мвссиве и выводи результирующий массив из двух чисел на экран
    }
}