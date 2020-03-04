
import java.awt.event.*;
import javax.swing.*;

public class Kalkulator extends JFrame{
    JTextField angka1, angka2, result;
    JButton plus, minus, multiply, div;
    
    public void Data(){
    
        setTitle("Kalkulator");
        
        angka1 = new JTextField();
        angka2 = new JTextField();
        result = new JTextField();
        
        plus        = new JButton("+");
        minus       = new JButton("-");
        multiply    = new JButton("*");
        div         = new JButton("/");
        
        setLayout(null);

        add(angka1);
        add(angka2);
        add(plus);
        add(minus);
        add(multiply);
        add(div);
        add(result);
        
        angka1.setBounds(20, 20, 195, 20);
        angka2.setBounds(20, 60, 195, 20);
        plus.setBounds(20, 90, 45, 20);
        minus.setBounds(70, 90, 45, 20);
        multiply.setBounds(120, 90, 45, 20);
        div.setBounds(170, 90, 45, 20);
        result.setBounds(20, 120, 195, 20);
        
        setSize(250, 200);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(angka1.getText());
                    double num2 = Double.parseDouble(angka2.getText());
                    double hasil = num1 + num2;
                    result.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Tidak boleh selain angka");
                }
                
            }
        });
        
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(angka1.getText());
                double num2 = Double.parseDouble(angka2.getText());
                double hasil = num1 - num2;
                result.setText(String.valueOf(hasil));
            }
        });
        
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(angka1.getText());
                double num2 = Double.parseDouble(angka2.getText());
                double hasil = num1 * num2;
                result.setText(String.valueOf(hasil));
            }
        });
        
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(angka1.getText());
                double num2 = Double.parseDouble(angka2.getText());
                double hasil = num1 / num2;
                result.setText(String.valueOf(hasil));
            }
        });
    }
}
