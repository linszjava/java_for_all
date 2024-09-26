package com.lin.juc.testPack;

public class ThreadTestDemo {

    /**
     * 观察线程的执行顺序
     * @param args
     */
    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();
        long currentThreadId = currentThread.getId();
        String currentThreadName = currentThread.getName();
        int currentThreadPriority = currentThread.getPriority();
        Thread.State currentThreadState = currentThread.getState();

        System.out.println("=========111==========");
        int a = 1 ;
        int b = 1 ;
        int c = a / b;
        System.out.println("main:"+ c);
        anotherFun();



        System.out.println("currentThreadId: "+currentThreadId);
        System.out.println("currentThreadName: "+currentThreadName);
        System.out.println("currentThreadPriority: "+currentThreadPriority);
        System.out.println("currentThreadState: "+currentThreadState);


    }

    private static void  anotherFun(){
        int a = 1 ;
        int b = 1 ;
        int c = a / b;
        System.out.println("anotherFun:"+ c);
        anotherFun2();
    }

    private static void anotherFun2(){
        int a = 1 ;
        int b = 1 ;
        int c = a / b;
        System.out.println("anotherFun2:"+ c);
    }


}
