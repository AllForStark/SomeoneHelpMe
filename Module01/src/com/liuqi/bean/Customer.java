package com.liuqi.bean;

import java.util.ArrayList;

public class Customer {

    public void test(){
        System.out.println("methodtest");

    }

    public static void main(String[] args) {
        System.out.println("Customer.main");
        int num1 = 12;
        System.out.println("num1 = " + num1);

        string[] arr = new string[]{"tom","jerry","hanmeiemi"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (string string : arr) {
            System.out.println(string);
        }

        for (int i = 0; i < arr.length; i++) {
            string string = arr[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(23);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        for (int i = list.size() - 1; i >= 0; i--) {


        }


    }


}
