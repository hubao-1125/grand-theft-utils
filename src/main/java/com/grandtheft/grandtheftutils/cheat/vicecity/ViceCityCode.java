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

    /**
     * 功能描述: 满血
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:04
     */
    public static void ASPIRINE() {
        try {
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

    /**
     * 功能描述: 满甲
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:04
     */
    public static void PRECIOUSPROTECTION() {
        try {
            Robot robot = new Robot();
            robot.keyPress(VK_P);
            robot.keyRelease(VK_P);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_C);
            robot.keyRelease(VK_C);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_U);
            robot.keyRelease(VK_U);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_P);
            robot.keyRelease(VK_P);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_C);
            robot.keyRelease(VK_C);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 棍子类武器
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:09
     */
    public static void THUGSTOOLS() {
        try {
            Robot robot = new Robot();
            // THUGS
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_H);
            robot.keyRelease(VK_H);
            robot.keyPress(VK_U);
            robot.keyRelease(VK_U);
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);

            // TOOLS
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


    /**
     * 功能描述: 枪类武器
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:11
     */
    public static void PROFESSIONALTOOLS() {
        try {
            Robot robot = new Robot();
            // PROFESSIONAL
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

            // TOOLS
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

    /**
     * 功能描述:  变态武器
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:11
     */
    public static void NUTTERTOOLS() {
        try {
            Robot robot = new Robot();
            // NUTTER
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_U);
            robot.keyRelease(VK_U);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);

            // TOOLS
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

    /**
     * 功能描述: 汽车爆炸
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:12
     */
    public static void BIGBANG() {
        try {
            Robot robot = new Robot();
            // BIG
            robot.keyPress(VK_B);
            robot.keyRelease(VK_B);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);

            // BAND
            robot.keyPress(VK_B);
            robot.keyRelease(VK_B);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 坦克
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:13
     */
    public static void PANZER() {
        try {
            Robot robot = new Robot();
            robot.keyPress(VK_P);
            robot.keyRelease(VK_P);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_Z);
            robot.keyRelease(VK_Z);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 水上漂
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:14
     */
    public static void SEAWAYS() {
        try {
            Robot robot = new Robot();
            // SEA
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);

            // WAYS
            robot.keyPress(VK_W);
            robot.keyRelease(VK_W);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_Y);
            robot.keyRelease(VK_Y);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 得到超超快车
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:15
     */
    public static void GETTHEREAMAZINGLYFAST() {
        try {
            Robot robot = new Robot();
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_H);
            robot.keyRelease(VK_H);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);

            // AMAZINGLY
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_M);
            robot.keyRelease(VK_M);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_Z);
            robot.keyRelease(VK_Z);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);
            robot.keyPress(VK_L);
            robot.keyRelease(VK_L);
            robot.keyPress(VK_Y);
            robot.keyRelease(VK_Y);

            // FAST
            robot.keyPress(VK_F);
            robot.keyRelease(VK_F);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 得到46号车
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:18
     */
    public static void GETTHEREVERYFASTINDEED() {
        try {
            Robot robot = new Robot();
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_H);
            robot.keyRelease(VK_H);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);

            // VERY
            robot.keyPress(VK_V);
            robot.keyRelease(VK_V);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_Y);
            robot.keyRelease(VK_Y);

            // FAST
            robot.keyPress(VK_F);
            robot.keyRelease(VK_F);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_S);
            robot.keyRelease(VK_S);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);

            // IN
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);

            // DEED
            robot.keyPress(VK_D);
            robot.keyRelease(VK_D);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_D);
            robot.keyRelease(VK_D);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 得到48号车
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:26
     */
    public static void GETTHEREQUICKLY() {
        try {
            Robot robot = new Robot();
            robot.keyPress(VK_G);
            robot.keyRelease(VK_G);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_T);
            robot.keyRelease(VK_T);
            robot.keyPress(VK_H);
            robot.keyRelease(VK_H);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_R);
            robot.keyRelease(VK_R);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);

            // QUICKLY
            robot.keyPress(VK_Q);
            robot.keyRelease(VK_Q);
            robot.keyPress(VK_U);
            robot.keyRelease(VK_U);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_C);
            robot.keyRelease(VK_C);
            robot.keyPress(VK_K);
            robot.keyRelease(VK_K);
            robot.keyPress(VK_L);
            robot.keyRelease(VK_L);
            robot.keyPress(VK_Y);
            robot.keyRelease(VK_Y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述: 通缉星星归零
     * @return void
     * @author hubao
     * @Date: 2021/8/2 22:26
     */
    public static void LEAVEMEALONE() {
        try {
            Robot robot = new Robot();
            // LEAVE
            robot.keyPress(VK_L);
            robot.keyRelease(VK_L);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_V);
            robot.keyRelease(VK_V);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);

            // ME
            robot.keyPress(VK_M);
            robot.keyRelease(VK_M);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);

            // ALONE
            robot.keyPress(VK_A);
            robot.keyRelease(VK_A);
            robot.keyPress(VK_L);
            robot.keyRelease(VK_L);
            robot.keyPress(VK_O);
            robot.keyRelease(VK_O);
            robot.keyPress(VK_N);
            robot.keyRelease(VK_N);
            robot.keyPress(VK_E);
            robot.keyRelease(VK_E);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
