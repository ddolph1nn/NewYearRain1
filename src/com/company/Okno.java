package com.company;

import javax.swing.*;
import java.awt.event.KeyListener;

public class Okno extends JFrame {

    public Okno() {
        // Задаем параметры для окна
        setBounds(0, 0, 1024, 768);

        // Создадим заголовок
        setTitle("Новогодний дождь");

        // Отобразить окно
        setVisible(true);
        addKeyListener(new MyKey());
    }

}




