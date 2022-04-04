package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("---Đảo ngược phần tử trong mảng số nguyên sử dụng Stack---");
        int[] array = {3, 2, 5, 84, 5, -1, 9};
        Stack<Integer> arr = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            arr.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.pop();
        }
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("--------Đảo ngược chuỗi sử dụng Stack--------");
        String str = "mWord";
        String newStr = "";
        Stack wStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            newStr+=wStack.pop();
        }
        newStr = newStr+"mWord";
        System.out.println("result = "+newStr);
    }
}
