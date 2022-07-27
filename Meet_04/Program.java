package Meet_04; // hapus ini jika terjadi error pada kompiler anda

import java.awt.event.*;  
import javax.swing.*;

public class Program{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program Penyewaan Tenda");

        JLabel Label1 = new JLabel("Jenis Tenda:");
        Label1.setBounds(30, 10, 100, 20);

        String JenisTenda[] = {"Tenda Kecil", "Tenda Sedang", "Tenda Besar"};
        JComboBox jComboBox = new JComboBox(JenisTenda);
        jComboBox.setBounds(160, 10, 130, 20);

        JLabel Label2 = new JLabel("Hari Peminjaman:");
        Label2.setBounds(30, 40, 100, 20);

        JTextField HariSewa = new JTextField();
        HariSewa.setBounds(160, 40, 130, 20);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(125, 100, 100, 30);

        Submit.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                int TotalHarga = 0;
                String InputJenisTenda = jComboBox.getSelectedItem().toString();
                int InputHari = Integer.parseInt(HariSewa.getText());

                if(InputJenisTenda == "Tenda Kecil"){
                    TotalHarga = 250000 * InputHari;
                }
                if(InputJenisTenda == "Tenda Sedang"){
                    TotalHarga = 500000 * InputHari;
                }
                if(InputJenisTenda == "Tenda Besar"){
                    TotalHarga = 1000000 * InputHari;
                }
                JOptionPane.showMessageDialog(null, 
                "\n\nTotal Biaya : " + TotalHarga + "\n\n");
            }  
        });  

        frame.add(Label1);
        frame.add(jComboBox);
        frame.add(Label2);
        frame.add(HariSewa);
        frame.add(Submit);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
