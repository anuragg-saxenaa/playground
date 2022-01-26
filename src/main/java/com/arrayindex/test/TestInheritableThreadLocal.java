package com.arrayindex.test;

public class TestInheritableThreadLocal {

    public static void main(String[] args) {

        Thread pt = new Thread(new ParentThread());
        pt.start();


    }




}

class ParentThread implements  Runnable{
    static InheritableThreadLocal<Integer> i= new InheritableThreadLocal<Integer>(){
       @Override
        protected Integer childValue(Integer  parentValue) {
            return parentValue+10;
        }

    };
    @Override
    public void run() {
        Thread.currentThread().setName("Parent");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        i.set(10);
        System.out.println(i.get());
        //
        Thread ct = new Thread(new ChildThread());
        ct.start();
    }
}

class ChildThread implements  Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("child");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(ParentThread.i.get());
    }
}

