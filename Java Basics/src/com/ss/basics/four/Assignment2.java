package com.ss.basics.four;

public class Assignment2 extends Thread {
    public static void main(String[] args){
        Assignment2 asgn2 = new Assignment2();
        Assignment2 asgn1 = new Assignment2();
        Runnable thr1 = new Runnable(){
            @Override
			public void run() {
                asgn1.deadlockFunct(asgn2);
                asgn2.undeadLocked();
                System.out.printf("Done with Thread1\n");
			}
		};
        Runnable thr2 = new Runnable(){
            @Override
			public void run() {
                asgn2.deadlockFunct(asgn1, 1);
                asgn1.undeadLocked();
                System.out.printf("Done with Thread2\n");
			}
		};

        new Thread(thr1).start();
        new Thread(thr2).start();
        System.out.printf("Ran Threads\n");
    }

    public synchronized void deadlockFunct(Assignment2 item){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        item.undeadLocked();
    }

    public synchronized void undeadLocked(){
        System.out.printf("Out of deadlock \n");
    }
}
