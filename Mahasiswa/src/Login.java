import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {

    JLabel judul, name, no, gender, religion, address;
    JTextField nama, nim;
    JRadioButton l, p;
    JComboBox agama;
    JTextArea alamat;
    JButton ok;

    String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};

    public void Data(){

        setTitle("Data Diri Mahasiswa");

        judul       = new JLabel("DATA DIRI MAHASISWA");
        name        = new JLabel("Nama");
        no          = new JLabel("NIM");
        gender      = new JLabel("Jenis Kelamin");
        religion    = new JLabel("Agama");
        address     = new JLabel("Alamat");

        nama    = new JTextField();
        nim     = new JTextField();

        l                   = new JRadioButton("L");
        p                   = new JRadioButton("P");

        ButtonGroup group   = new ButtonGroup();
        group.add(l);
        group.add(p);

        agama   = new JComboBox(namaAgama);
        alamat  = new JTextArea();

        ok      = new JButton("OK");

        setLayout(null);

        add(judul);
        add(name);
        add(no);
        add(gender);
        add(religion);
        add(address);
        add(nama);
        add(nim);
        add(l);
        add(p);
        add(agama);
        add(alamat);
        add(ok);

        judul.setBounds(170, 20, 200, 20);
        name.setBounds(40, 60, 100, 20);
        nama.setBounds(160, 60, 270, 20);
        no.setBounds(40, 90, 100, 20);
        nim.setBounds(160, 90, 270, 20);
        gender.setBounds(40, 120, 100, 20);
        l.setBounds(160, 120, 50, 20);
        p.setBounds(220, 120, 50, 20);
        religion.setBounds(40, 150, 100, 20);
        agama.setBounds(160, 150, 270, 20);
        address.setBounds(40, 180, 100, 20);
        alamat.setBounds(160, 180, 270, 100);
        ok.setBounds(360, 290, 70, 20);

        setSize(500, 380);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isiNama      = nama.getText();
                String isiNim       = nim.getText();
                String isiGender    = rb();
                String isiAgama     = (String)agama.getSelectedItem().toString();
                
                System.out.println("Nama    = " + isiNama);
                System.out.println("NIM     = " + isiNim);
                System.out.println("Gender  = " + isiGender);
                System.out.println("Agama   = " + isiAgama);
            }    

            private String rb() {
                if(l.isSelected())
                    return "L";
                else
                    return "P";
            }
        });

    }
}
