package com.grandtheft.grandtheftutils.cheat.vicecity;

import com.grandtheft.grandtheftutils.cheat.CheatKeyCode;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 功能描述:
 *
 * @Author: 窦虎
 * @Date: 2021/7/31 19:48
 */
public class ViceCityCode extends KeyEvent {

    public ViceCityCode(Component source, int id, long when, int modifiers, int keyCode, char keyChar, int keyLocation) {
        super(source, id, when, modifiers, keyCode, keyChar, keyLocation);
    }

    public ViceCityCode(Component source, int id, long when, int modifiers, int keyCode, char keyChar) {
        super(source, id, when, modifiers, keyCode, keyChar);
    }

    public ViceCityCode(Component source, int id, long when, int modifiers, int keyCode) {
        super(source, id, when, modifiers, keyCode);
    }

    public static void ASPIRINE() {
        try {
            // aspirine
            Robot robot = new Robot();
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_P);
            robot.keyRelease(VK_P);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void PRECIOUSPROTECTION() {
        try {
            // PRECIOUSPROTECTION
            Robot robot = new Robot();
            robot.keyPress(VK_P);
            robot.keyPress(VK_R);
            robot.keyPress(VK_E);
            robot.keyPress(VK_C);
            robot.keyPress(VK_I);
            robot.keyPress(VK_O);
            robot.keyPress(VK_U);
            robot.keyPress(VK_S);
            robot.keyPress(VK_P);
            robot.keyPress(VK_R);
            robot.keyPress(VK_O);
            robot.keyPress(VK_T);
            robot.keyPress(VK_E);
            robot.keyPress(VK_C);
            robot.keyPress(VK_T);
            robot.keyPress(VK_I);
            robot.keyPress(VK_O);
            robot.keyPress(VK_N);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void PROFESSIONALTOOLS() {
        try {
            // PROFESSIONALTOOLS
            Robot robot = new Robot();
            robot.keyPress(VK_P);
            robot.keyRelease(VK_P);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_F);
            robot.keyRelease(VK_F);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_L);
            robot.keyRelease(VK_L);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_L);
            robot.keyRelease(VK_L);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
