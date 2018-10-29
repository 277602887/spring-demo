package com.springmvc.test;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 17:37 2018/9/17
 */
public class Machine extends Thread {
    private int a = 1;

    public synchronized void print() {
        System.out.println("a=" + a);
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            a = 1 / 0;
            a++;
        }
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.start();
        Thread.yield();
        machine.run();
    }
}