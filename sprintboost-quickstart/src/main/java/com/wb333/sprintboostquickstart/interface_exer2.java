package com.wb333.sprintboostquickstart;


interface Test{
    //这个是默认方法
    default void get(){
        System.out.println("我是jdk1.8默认实现方法...");
    }
    //这个是静态方法
    static void staticmethod(){
        System.out.println("我是静态方法");
    }
    void getTest();
}


interface test3{
    void getTest3();
}
interface Test2 extends Test{
    void getTest2();
}

class test_aaa implements Test2 {

    public void getTest() {
        System.out.println("I am Test");
    }

    public void getTest2(){
        System.out.println("I am Test2");
    }

    public void ttt(){
        System.out.println("ttt");
    }
}

public class interface_exer2{
    public static void main(String[] args) {
        test_aaa t = new test_aaa();
        t.getTest();
        t.getTest2();
        t.ttt();
        t.ttt();
        t.ttt();
    }
}
