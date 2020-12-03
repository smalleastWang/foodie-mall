package com.test;

/**
 * @Author : wangxiaodong
 * @Program : com.test
 * @Description : TODO
 * @Date 2020/12/3 下午2:51
 **/

public class ManyThread {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {}
                System.out.println("thread end.");
            }
        };
        t.start();
        // try {
        //     Thread.sleep(20);
        // } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}
