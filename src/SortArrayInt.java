import java.util.Arrays;

public class SortArrayInt implements SortArrays<Integer>{


    @Override // сортировка массива по возрастанию
    public Integer[] sort(Integer[] mass) {
        for(int i=0;i<mass.length;i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] > mass[j]) {
                    int a = mass[i];
                    swap(mass, i, j, a);
                }
            }
        }
        System.out.println("Sorted array: "+Arrays.toString(mass));
        return mass;
    }

    @Override // начодим в массиве читсел два слагаемых заданного в аргументах числа, формируем массив с ответом
    public Integer[] searchResult(Integer[] mass, Integer t) {
        Integer[] resultMass = new Integer[2];
        int startPointer = 0;
        int finalPointer = mass.length-1;
        while(startPointer<finalPointer){
            if(mass[startPointer]+mass[finalPointer]==t){
                resultMass = new Integer[]{mass[startPointer], mass[finalPointer]};
                System.out.println("Desired array: "+ Arrays.toString(resultMass));
                return resultMass;
            }
            else if(mass[startPointer]+mass[finalPointer]<t){
                startPointer++;
            }
            else {
                finalPointer--;
            }
        }
        System.out.println("Result not found!");
        return new Integer[0];
    }

    private void swap(Integer[] mass, int i, int j, int a){
        mass[i] = mass [j];
        mass[j] = a;
    }
}
