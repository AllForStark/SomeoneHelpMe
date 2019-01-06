package com.liuqi.java;

import sun.print.PSStreamPrinterFactory;

import java.lang.reflect.Array;
import java.time.format.TextStyle;
import java.util.ArrayList;

/**
 * @author lucia
 * @date 2018/12/20 - 16:58
 */
public class TemplateTest {

    private static final String str;

    /**
     * 关于模板：
     * 模板一：main方法的模板：psvm
     *         控制台输出去模板：sout
     *         数字for循环        ：fori
     *         增强for循环    ：iter
     *         数组for循环    ：itar
     *         集合for循环    ：list.fori
     *         集合倒序for循环：list.forr
     *         如果为null     ：ifn
     *         如果不为null   ：inn
     *         私有静态常量   ：prsf
     *         多行注释：crtl+shift+/
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("你哈啊！！！");
        System.out.println("23333");
        for (int i = 0; i < 23; i++) {
            System.out.println(i);
        }
        for (Object o : list) {
            System.out.println(o);
        }
        String[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList<String> list1 = new ArrayList<>();
        for (String o : list) {
            System.out.println(o);
        }
        /*if (list1 == null) {

        }
        if (list1 != null) {

            new ArrayList<String>();

        }
*/

        public void test2(){

        }
        
        public void test1(){
            
        }

    }

}
