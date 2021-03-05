package ru.job4j.algo.search.binary;

/**
 * Предполагается, что входной массив
 * отсортирован по возрастанию.
 *
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 05.03.2021
 */
public final class BinarySearch {
    private final int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    /**
     * Метод возвращает индекс
     * элемента в массиве с
     * переданным значением.
     * Если таких элементов
     * несколько, будет
     * возвращён индекс
     * любого.
     *
     * @param value - значение искомого
     *                элемента
     * @return индекс искомого элемента
     */
    public int getIndexOfValue(int value) {
        int result = -1;

        int left = 0;
        int right = array.length - 1;
        while (right - left > 1) {
            int t = (left + right) / 2;
            if (array[t] >= value) {
                right = t;
            } else {
                left = t;
            }
        }

        if (array[left] == value) {
            result = left;
        } else if (array[right] == value) {
            result = right;
        }

        return result;
    }
}
