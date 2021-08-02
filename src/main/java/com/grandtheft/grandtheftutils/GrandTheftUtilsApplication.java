package com.grandtheft.grandtheftutils;

import com.grandtheft.grandtheftutils.cheat.vicecity.ViceCity;
import com.grandtheft.grandtheftutils.test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class GrandTheftUtilsApplication {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViceCity viceCity = new ViceCity();
                    viceCity.createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("抛异常了~~~");
                }
            }
        });

        SpringApplication.run(GrandTheftUtilsApplication.class, args);
    }

}
