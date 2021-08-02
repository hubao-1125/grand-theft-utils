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

        // 注册按键
        KeyBoardAllRegister.registerKeyboard();
        // 创建热键监听器
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            public void onHotKey(int markCode) {
                System.out.println("markCode:::" + markCode);
                KeyBoardEnum boardEnum = KeyBoardEnum.getKeyBoardEnumByMarkCode(markCode);
                try {
                    switch (boardEnum) {
                        case F1:
                            ViceCityCode.ASPIRINE();
                            break;
                        case F2:
                            ViceCityCode.PRECIOUSPROTECTION();
                            break;
                        case F3:
                            ViceCityCode.THUGSTOOLS();
                            break;
                        case F4:
                            ViceCityCode.PROFESSIONALTOOLS();
                            break;
                        case F5:
                            ViceCityCode.NUTTERTOOLS();
                            break;
                        case F6:
                            ViceCityCode.BIGBANG();
                            break;
                        case F7:
                            ViceCityCode.PANZER();
                            break;
                        case F8:
                            ViceCityCode.SEAWAYS();
                            break;
                        case F9:
                            ViceCityCode.GETTHEREAMAZINGLYFAST();
                            break;
                        case F10:
                            ViceCityCode.GETTHEREVERYFASTINDEED();
                            break;
                        case F11:
                            ViceCityCode.GETTHEREQUICKLY();
                            break;
                        case BSL:
                            ViceCityCode.LEAVEMEALONE();
                            break;
                        default:
                            System.out.println("00000000000000");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


//        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
//            public void eventDispatched(AWTEvent event) {
//                if (((KeyEvent) event).getID() == KeyEvent.KEY_PRESSED) {
//                    int keyCode = ((KeyEvent) event).getKeyCode();
//                    char keyChar = ((KeyEvent) event).getKeyChar();
//                    System.out.println(keyCode);
//                    if (keyCode == KeyEvent.VK_F1) {
//                        System.out.println("F1");
//                    }
//                }
//            }
//        }, AWTEvent.KEY_EVENT_MASK);
    }
}
