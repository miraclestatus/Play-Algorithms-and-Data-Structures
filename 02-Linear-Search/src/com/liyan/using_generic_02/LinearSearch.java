package com.liyan.using_generic_02;

/**
 * @author Eric Lee
 * @date 2020/9/17 13:53
 *  线性查找
 */
public class LinearSearch {

    public static <E> int search(E[] data , E target){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        System.out.println(LinearSearch.search(data, 19));
        System.out.println(LinearSearch.search(data, 16));

    }
}
