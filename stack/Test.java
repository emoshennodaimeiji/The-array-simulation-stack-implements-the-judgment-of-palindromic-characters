package edu.zut.cn.stack;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        boolean a1 = pdfunction("aba");
        boolean a2 = pdfunction("abcd");
        System.out.println(a1);
        System.out.println(a2);
    }

    public static boolean pdfunction(String val){
        ArrayStack arrayStack = new ArrayStack(10);

        for(int i = 0;i<val.length();i++){//将字符挨个压栈
            try {
                arrayStack.push(val.charAt(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String val2 = "";
        int length1 = arrayStack.length();//因为length函数是依托于top的值，而pop函数执行下去会减少top从而减少length，故需要提取出
        for(int i = 0;i<length1;i++){//挨个弹栈并拼入val2中
            try {
                char n = (char)arrayStack.pop();
                val2 = val2+n;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return val2.equals(val);//判断压栈前和弹栈后两个字符串是否相等
    }
}
