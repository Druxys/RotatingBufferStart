package com.jad;
import com.jad.RotatingBuffer.RotatingBuffer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        RotatingBuffer<Integer> buffer = new RotatingBuffer<>(Integer.class, 2);
        Random rand = new Random();
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if(!buffer.write(i)) {
                    System.out.print("-");
                }
                try {
                    Thread.sleep(rand.nextInt(500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread reader = new Thread(() -> {
            for (; ; ) {
                Integer temp = buffer.read();
                if (temp != null) {
                    System.out.print("[" + temp + "]");
                } else {
                    System.out.print(".");
                }
                try {
                    Thread.sleep(rand.nextInt(500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();
    }
}
