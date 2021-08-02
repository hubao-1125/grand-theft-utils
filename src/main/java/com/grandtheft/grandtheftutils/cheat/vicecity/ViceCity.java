package com.grandtheft.grandtheftutils.cheat.vicecity;

import com.grandtheft.grandtheftutils.keyboard.KeyBoardAllRegister;
import com.grandtheft.grandtheftutils.keyboard.KeyBoardEnum;
import com.grandtheft.grandtheftutils.ui.ViceCityLabelText;
import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import org.springframework.core.io.ClassPathResource;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.net.URL;

/**
 * 功能描述: 罪恶都市
 *
 * @Author: 窦虎
 * @Date: 2021/7/31 19:32
 */
public class ViceCity implements Serializable {


    public void createAndShowGUI() throws Exception {
        // 确保一个漂亮的外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);

        // 创建及设置窗口
        JFrame frame = new JFrame("罪恶都市手动作弊器");
        // 设置图标
        URL resource = Thread.currentThread().getContextClassLoader().getResource("img/vicecity.jpg");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(resource));
        // 设置大小
        frame.setPreferredSize(new Dimension(800, 600));
//        frame.setSize(10000, 8000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 标签
        JLabel label = new JLabel(ViceCityLabelText.TEXT);
        frame.getContentPane().add(label);
        // 显示窗口
        frame.pack();
        frame.setVisible(true);

        KeyBoardAllRegister.registerKeyboard();
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            public void onHotKey(int markCode) {

                KeyBoardEnum boardEnum = KeyBoardEnum.getKeyBoardEnumByMarkCode(markCode);

                try {
                    switch (boardEnum) {
                        case F1:
                            System.out.println("111111111111111111");
                            ViceCityCode.ASPIRINE();
                            break;
                        case F2:
                            System.out.println("22222222222222222");
                            break;
                        case F3:
                            System.out.println("333333333333333333");
                            break;
                        case F4:
                            System.out.println("44444444444444444");
                            ViceCityCode.PROFESSIONALTOOLS();
                            break;
                        default:
                            System.out.println("00000000000000");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            public void eventDispatched(AWTEvent event) {
                if (((KeyEvent) event).getID() == KeyEvent.KEY_PRESSED) {
                    int keyCode = ((KeyEvent) event).getKeyCode();
//                    char keyChar = ((KeyEvent) event).getKeyChar();
                    if (keyCode == KeyEvent.VK_F1) {
                        System.out.println("F111111111111111111111111");
                        try {
                            Robot robot = new Robot();
//                            robot.keyPress(keyCode);
                        } catch (AWTException e) {
                            e.printStackTrace();
                        }
                    } else if (keyCode == KeyEvent.VK_F2) {
                        System.out.println("F2222222222222222222222");
                    }
                }
            }
        }, AWTEvent.KEY_EVENT_MASK);
    }
}
