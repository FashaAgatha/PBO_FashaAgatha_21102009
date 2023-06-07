package com.Fasha.PBO.Pertemuan7;

import javax.swing.*;

public class Registration extends JFrame {
    private JTextField textNama;
    private JTextField textNim;
    private JComboBox comboBox1;
    private JTextField textTelepon;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JTextArea textAlamat;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public Registration(){
        super("Formulir registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 600);
    }

    public static void main(String[] args){
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}
