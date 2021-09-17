package com.ss.basics.four;

public class Assignment3 {
    public static void main(String[] args){
        Singleton thr1Instance = Singleton.getInstance();
        Singleton thr2Instance = Singleton.getInstance();

        Runnable pushThread = new Runnable(){
            @Override
			public void run() {
                for(int i = 0; i< 1000; i++){
                    synchronized(thr1Instance){
                        while(!thr1Instance.isFull()){
                            thr1Instance.push(i);
                        }
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
			}
		};
        Runnable pullThread = new Runnable(){
            @Override
			public void run() {
                int number = 0;
                while(number < 1000){
                    synchronized(thr2Instance){
                        if(!thr2Instance.isEmpty()){
                            number = thr2Instance.pull();
                            System.out.printf("Grabbed number %d\n", number);
                        }
                    }
                }
			}
		};

        new Thread(pushThread).start();
        new Thread(pullThread).start();
    }
}
