package com.grandtheft.grandtheftutils.test;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import org.springframework.core.io.ClassPathResource;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.net.URL;

/**
 * 功能描述:
 *
 * @Author: 窦虎
 * @Date: 2021/7/31 16:24
 */
public class Test {

    public void createAndShowGUI() throws Exception {
        // 确保一个漂亮的外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);

        // 创建及设置窗口
        JFrame frame = new JFrame("罪恶都市手动作弊器");
        ImageIcon icon = new ImageIcon("src\\main\\resources\\vicecity.ico");
        String src = "/img/vicecity.jpg";
        Image img = ImageIO.read(new ClassPathResource(src).getInputStream());
        frame.setIconImage(img);
        frame.setIconImage(icon.getImage());
//        URL resource = Thread.currentThread().getContextClassLoader().getResource("vicecity.ico");
        URL resource = Thread.currentThread().getContextClassLoader().getResource("img/vicecity.jpg");
        Image image = Toolkit.getDefaultToolkit().getImage(resource);
        frame.setIconImage(image);
        frame.setPreferredSize(new Dimension(800, 600));
//        frame.setSize(10000, 8000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加 "Hello World" 标签
        String text = "<html>F1（满血）- ASPIRINE<br>" +
                      "F2（满甲）- PRECIOUSPROTECTION<br>" +
                "F3（棍子类武器）- THUGSTOOLS<br>" +
                "F4（枪类武器） - PROFESSIONALTOOLS<br>" +
                "F5（变态武器） - NUTTERTOOLS<br>" +
                "F6（汽车爆炸） - BIGBANG<br>" +
                "F7（坦克） - PANZER<br>" +
                "F8（水上漂） - SEAWAYS<br>" +
                "F9（得到超超快车） - GETTHEREAMAZINGLYFAST<br>" +
                "F10（得到46号车） - GETTHEREVERYFASTINDEED<br>" +
                "F11（得到48号车） - GETTHEREQUICKLY<br>" +
                "F12（通缉星星归零） - LEAVEMEALONE" +
                "~~~<html>";
        JLabel label = new JLabel(text);
        frame.getContentPane().add(label);
        // 显示窗口
        frame.pack();
        frame.setVisible(true);

        JIntellitype.getInstance().registerHotKey(1, "F1");
        JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
            public void onHotKey(int markCode) {
                switch (markCode) {
                    case 1:
                        System.out.println("111111111111111111");
                        break;
                    default:
                        System.out.println("00000000000000");
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
