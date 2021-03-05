package ru.job4j.algo.search.ternar;

/**
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 05.03.2021
 */
public final class TernarSearch {
    private final static int MIN_INT = -2147483648;

    /**
     * Предполагается, что значения
     * массива отсортированы таким образом,
     * что представляю собой унимодальную
     * функцию. До определённого элемента
     * строго возрастают, далее - строго убывают.
     *
     * Метод применяет тернарный поиск
     * для поиска данной точки максимума.
     * @param array
     * @return - значение элемента, являющегося
     *           точкой максимума унимодальной функции.
     */
    public int findPeak(int[] array) {
        int result = MIN_INT;
        int left = 0;
        int right = array.length - 1;
        while (right - left > 2) {
            int tl = left + (right - left) / 3;
            int tr= right -  (right - left) / 3;
            if (array[tl] == array[tr]) {
                left = tl;
                right = tr;
            } else if (array[tl] < array[tr]) {
                left = tl;
            } else {
                right = tr;
            }
        }
        return findMaxOnRange(array, left, right);
    }

    private int findMaxOnRange(int[] array, int l, int r) {
        int result = array[l];
        for (int i = l+1; i <= r; ++i) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }
}
