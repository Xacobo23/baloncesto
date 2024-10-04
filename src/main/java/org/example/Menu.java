package org.example;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    public Menu(){
        setTitle("Baloncesto");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JPanel opciones = new JPanel();
        opciones.setPreferredSize(new Dimension(800,50));

        JButton anhadir = new JButton("Añadir un equipo");
        opciones.add(anhadir);

        JButton clasificacion = new JButton("Mostrar la Clasificacion");
        opciones.add(clasificacion);

        JButton guardar = new JButton("Guardar la Clasificación");
        opciones.add(guardar);

        JButton cargar = new JButton("Cargar la Clasificación");
        opciones.add(cargar);

        JPanel salir = new JPanel();
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        salir.setPreferredSize(new Dimension(800,100));
        salir.add(btnSalir);
        JPanel resultado = new JPanel();
        resultado.setPreferredSize(new Dimension(800,650));
        anhadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        clasificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setBackground(Color.BLUE);
            }
        });
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setBackground(Color.gray);
            }
        });
        cargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setBackground(Color.orange);
            }
        });
        add(resultado, BorderLayout.SOUTH);

        add(opciones, BorderLayout.NORTH);
        add(salir, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu frame = new Menu();
            frame.setVisible(true);
        });
    }
}
