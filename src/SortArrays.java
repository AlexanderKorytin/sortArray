/* Интерфейс для реализации сортировки и проведения вычислений в массиве */
public interface SortArrays<T> {
    T[] sort(T[] mass);

    T[] searchResult(T[] mass, T t);
}
