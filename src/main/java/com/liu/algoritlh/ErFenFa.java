package com.liu.algoritlh;

/**
 * Created by Administrator on 2018/10/13/013.
 */
public class ErFenFa {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 8, 9, 15, 25, 67, 89, 98};
        System.out.println(method(array, 0, array.length - 1, 25));
    }

    public static int method(int[] array, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int middle = (end - start) / 2 + start;
        if (array[middle] == key) {
            return middle;
        } else if (array[middle] > key) {
            return method(array, start, middle - 1, key);
        } else {
            return method(array, middle + 1, end, key);
        }
    }

}
