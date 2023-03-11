import java.util.Scanner;

public class FillArray implements FillArrayFromStr{
    String[] strMass;
    String str;
    int request;
    Scanner scan = new Scanner(System.in);
    public int requestСondition () {
        while (true) {
            System.out.println("Enter an integer, the terms of which will be searched in the array?");
            if (scan.hasNextInt()) {
                request = scan.nextInt();
                break;
            } else {
                System.out.println("Error!!! Enter an integer, the terms of which will be searched in the array!");
            }
        }
        scan.close();
        return request;
    }

    @Override
    public Integer[] ArrayFromString(String str) {
        strMass = str.split(" ");
        Integer[] mass = new Integer[strMass.length];
        for (int i = 0; i < strMass.length; i++) {
            try {
                mass[i] = Integer.parseInt(strMass[i]);
            } catch (NumberFormatException e) {
                mass[i] = 0;
            }
        }
        return mass;
    }
}

