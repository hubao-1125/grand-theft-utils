package com.grandtheft.grandtheftutils.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * 功能描述:
 *
 * @Author: 窦虎
 * @Date: 2021/7/31 18:10
 */
public class Key_Board_In extends JFrame implements KeyListener {
    public Vector<JButton> Line1_Key=new Vector<JButton>();
    public Vector<JButton> Line2_Key=new Vector<JButton>();
    public Vector<JButton> Line3_Key=new Vector<JButton>();
    public Vector<JButton> Line4_Key=new Vector<JButton>();
    public Vector<JButton> Line5_Key=new Vector<JButton>();
    public Vector<JButton> Line6_Key=new Vector<JButton>();

    public String []Line1_KeyValue={"Esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","PrtSc","NumLock"};//上
    public boolean []Line1_bool={false,false,false,false,false,false,false,true,false,false,false,false,false,true,true};
    public String []Line2_KeyValue={"  `  ","   1  ","   2  " , "   3  ","   4  ","   5  ","   6  ","   7  ","   8  ","   9  ","   0  ","  -  ","  =  ","      <---     "};
    public boolean []Line2_bool={false,false,false,false,false,false,false,false,false,false,false,false,false,false};
    public String []Line3_KeyValue={"       Tab       ","  Q  ","  W  ","  E  ","  R  ","  T  ","  Y  ","  U  ","  I  ","  O  ","  P  ","  [  ","  ]  ","  Del  "};
    public boolean []Line3_bool={true,false,false,false,false,false,false,false,false,false,false,false,false,false};
    public String []Line4_KeyValue={"    CapsLock   ","  A  ","  S  ","  D  ","  F  ","  G  ","  H  ","  J  ","  K  ","  L  ","  ;  ","  ,  ","        Enter        "};
    public boolean []Line4_bool={false,false,false,false,false,false,false,false,false,false,false,false,false};
    public String []Line5_KeyValue={"         Shift          ","   Z   ","   X   ","   C   ","   V   ","   B   ","   N   ","   M   ","   ,   ","   .   ","   /   ","        Shift        "};
    public boolean []Line5_bool={false,false,false,false,false,false,false,false,false,false,false,false};
    public String []Line6_KeyValue={"   Ctrl  ","  Fn  ","  Alt  ","                      Empty                      ","  Alt  ","   \\   ","   Home   ","   PgUP   ","   PgDn   ","  End "};
    public boolean []Line6_bool={false,false,false,false,false,false,false,false,false,false};

    public int InputKeyTotal=4;
    public JPanel Line1=new JPanel();
    public JPanel Line2=new JPanel();
    public JPanel Line3=new JPanel();
    public JPanel Line4=new JPanel();
    public JPanel Line5=new JPanel();
    public JPanel Line6=new JPanel();
    public JPanel AllLine=new JPanel();
    public static void main(String []args)
    {
        Key_Board_In MyKey_Board_In = new Key_Board_In();
    }

    public Key_Board_In()
    {
        //添加键值
        for(int n=0;n<this.Line1_KeyValue.length;n++)//第一列键盘
            this.SetButton(this.Line1_KeyValue[n], 10, 8,Line1_Key);

        for(int x=0;x<this.Line2_KeyValue.length;x++)//第二列键盘
            this.SetButton(this.Line2_KeyValue[x], 20, 10,Line2_Key);
        for(int x=0;x<this.Line3_KeyValue.length;x++)//第三列键盘
            this.SetButton(this.Line3_KeyValue[x], 20, 10,Line3_Key);
        for(int x=0;x<this.Line4_KeyValue.length;x++)//第四列键盘
            this.SetButton(this.Line4_KeyValue[x], 20, 10,Line4_Key);
        for(int x=0;x<this.Line5_KeyValue.length;x++)//第五列键盘
            this.SetButton(this.Line5_KeyValue[x], 20, 10,Line5_Key);
        for(int x=0;x<this.Line6_KeyValue.length;x++)//第六列键盘
            this.SetButton(this.Line6_KeyValue[x], 20, 10,Line6_Key);

        //添加控件到面板
        this.SetJPanel(Line1_Key,Line1);
        this.SetJPanel(Line2_Key,Line2);
        this.SetJPanel(Line3_Key,Line3);
        this.SetJPanel(Line4_Key,Line4);
        this.SetJPanel(Line5_Key,Line5);
        this.SetJPanel(Line6_Key,Line6);

        //添加面板到集合面板
        AllLine.add(Line1);
        AllLine.add(Line2);
        AllLine.add(Line3);
        AllLine.add(Line4);
        AllLine.add(Line5);
        AllLine.add(Line6);

        //窗体设置
        this.add(AllLine);
        this.setUndecorated(true);
        this.setSize(880,290);
        this.setResizable(false);
        this.setLocation(1920/2, 1080/2);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.draw();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
    }

    private void draw()//增加
    {

        for(int i=0;i< Line1_Key.size();i++)
        {
            Line1_Key.get(i).addKeyListener(this);
        }

        for(int i=0;i< Line2_Key.size();i++)
        {
            Line2_Key.get(i).addKeyListener(this);
        }

        for(int i=0;i< Line3_Key.size();i++)
        {
            Line3_Key.get(i).addKeyListener(this);
        }

        for(int i=0;i< Line4_Key.size();i++)
        {
            Line4_Key.get(i).addKeyListener(this);
        }

        for(int i=0;i< Line5_Key.size();i++)
        {
            Line5_Key.get(i).addKeyListener(this);
        }

        for(int i=0;i< Line6_Key.size();i++)
        {
            Line6_Key.get(i).addKeyListener(this);
        }
    }
    public void SetButton(String KeyStr,int x,int y,Vector<JButton>LineKey)//添加每行键值
    {
        JButton Temp=new JButton(KeyStr);
        Temp.setSize(x,y);
        LineKey.add(Temp);
    }

    public void SetJPanel(Vector<JButton> LineKey,JPanel LineNumber)//将每行键值添加到板
    {
        for(int i=0;i<LineKey.size();i++)
            LineNumber.add(LineKey.get(i));
    }


    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println(e.getKeyCode());
        //System.out.println(this.InputKeyTotal);
        int []KeyValue1={27,112,113,114,115,116,117,118,119,120,121,122,123,0,144};
        int []KeyValue2={192,49,50,51,52,53,54,55,56,57,48,45,61,8};
        int []KeyValue3={9,81,87,69,82,84,89,85,73,79,80,91,93,127};
        int []KeyValue4={20,65,83,68,70,71,72,74,75,76,59,222,10};
        int []KeyValue5={16,90,88,67,86,66,78,77,44,46,47,16};
        int []KeyValue6={17,524,18,32,18,92,38,37,39,40};
        for(int i=0;i<Line1_Key.size();i++)
        {
            if(e.getKeyCode()==KeyValue1[i])
            {
                if(Line1_bool[i]==false)this.InputKeyTotal++;
                Line1_Key.get(i).setBackground(Color.green);
                Line1_bool[i]=true;
            }
            Line1_Key.get(7).setBackground(Color.green);
            Line1_Key.get(Line1_Key.size()-1).setBackground(Color.green);
            Line1_Key.get(Line1_Key.size()-2).setBackground(Color.green);
            Line3_Key.get(0).setBackground(Color.green);
        }

        for(int i=0;i<Line2_Key.size();i++)
        {
            if(e.getKeyCode()==KeyValue2[i])
            {
                if(Line2_bool[i]==false)this.InputKeyTotal++;
                Line2_Key.get(i).setBackground(Color.green);
                Line2_bool[i]=true;
            }
        }

        for(int i=1;i<Line3_Key.size();i++)
        {
            if(e.getKeyCode()==KeyValue3[i])
            {
                if(Line3_bool[i]==false)this.InputKeyTotal++;
                Line3_Key.get(i).setBackground(Color.green);
                Line3_bool[i]=true;
            }
        }

        for(int i=0;i<Line4_Key.size();i++)
        {
            if(e.getKeyCode()==KeyValue4[i])
            {
                if(Line4_bool[i]==false)this.InputKeyTotal++;
                Line4_Key.get(i).setBackground(Color.green);
                Line4_bool[i]=true;
            }
        }

        for(int i=0;i<Line5_Key.size();i++)
        {
            if(e.getKeyCode()==KeyValue5[i])
            {
                if(Line5_bool[i]==false)this.InputKeyTotal++;
                Line5_Key.get(i).setBackground(Color.green);
                Line5_bool[i]=true;
            }
        }

        for(int i=0;i<Line6_Key.size();i++)
        {
            if(e.getKeyCode()==KeyValue6[i])
            {
                if(Line6_bool[i]==false)this.InputKeyTotal++;
                Line6_Key.get(i).setBackground(Color.green);
                Line6_bool[i]=true;
            }
        }
        if(this.InputKeyTotal==78)System.exit(0);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }

    @Override
    public void keyTyped(KeyEvent e){}
}
