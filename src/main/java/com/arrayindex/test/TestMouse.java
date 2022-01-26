package com.arrayindex.test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Instant;

public class TestMouse {

    public static void main(String[] args) throws AWTException {
        System.out.println("started at..... "+ Instant.now());
        Robot rob = new Robot();
        PointerInfo ptr = null;
        while (true) {
            getDelay(rob,60,5);  // Mouse moves every 5 mins
            ptr = MouseInfo.getPointerInfo();
            System.out.println(Instant.now());
            rob.mouseMove((int) ptr.getLocation().getX() , (int) ptr.getLocation().getY());
            //rob.keyPress(KeyEvent.VK_DOWN);
            //rob.keyRelease(KeyEvent.VK_DOWN);
        }
    }

    private static void getDelay(Robot rob, int freq , int mul) {
        for (int i = 0; i < mul; i++) {
            rob.delay(freq*1000);
        }

    }
}

