package LabActivity;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab_Act4_StudentEnrollmentGUI extends JFrame {
    private static final String FILE_NAME = "StudentData.txt";
    private static final String DELIMITER = "----";

    Lab_Act4_StudentEnrollmentGUI(){

        JOptionPane.showMessageDialog(null,"WELCOME TO JUDE'S ACADEMY GA!","JUDE'S ACADEMY",
                JOptionPane.INFORMATION_MESSAGE);

        JLabel title1 = new JLabel("Student Enrollment System");
        title1.setFont(new Font("Cambria",Font.BOLD,23));
        title1.setForeground(new Color(0xFF6363));
        add(title1).setBounds(195,22,300,25);


        JLabel subtitle1 = new JLabel("Student Information:");
        subtitle1.setFont(new Font("Times New Roman",Font.BOLD,15));
        subtitle1.setForeground(new Color(0xFF6363));
        add(subtitle1).setBounds(20,30,200,100);


        JLabel subtitle2 = new JLabel("Academic Information:");
        subtitle2.setFont(new Font("Times New Roman",Font.BOLD,15));
        subtitle2.setForeground(new Color(0xFF6363));
        add(subtitle2).setBounds(300,30,200,100);


        JLabel lblfullname = new JLabel("Full Name:");
        add(lblfullname).setBounds(30,60,80,100);
        JTextField txtfullname = new JTextField();
        add(txtfullname).setBounds(95,100,150,20);


        JLabel lblage = new JLabel("Age:");
        add(lblage).setBounds(30,85,50,100);
        JTextField txtage = new JTextField();
        add(txtage).setBounds(95,125,150,20);


        JLabel lblgender = new JLabel("Gender:");
        add(lblgender).setBounds(30,110,50,100);
        String [] gender = {"Female","Male","LGBTQ++"};
        JComboBox<String> comboBox = new JComboBox<>(gender);
        comboBox.setBounds(95,150,150,20);
        comboBox.setBackground(new Color(0xFF6363));
        add(comboBox);


        JLabel lblprogram = new JLabel("Program:");
        add(lblprogram).setBounds(30,135,70,100);
        JTextField txtprogram = new JTextField();
        add(txtprogram).setBounds(95,175,150,20);


        JLabel lbladdress = new JLabel("Address:");
        add(lbladdress).setBounds(30,160,55,100);
        JTextField txtaddress = new JTextField();
        add(txtaddress).setBounds(95,200,150,20);


        JLabel lblemail = new JLabel("Email:");
        add(lblemail).setBounds(30,185,50,100);
        JTextField txtemail = new JTextField();
        add(txtemail).setBounds(95,225,150,20);


        JLabel lblbirthdate = new JLabel("Birthdate:");
        add(lblbirthdate).setBounds(30,210,80,100);
        JTextField txtbirthdate = new JTextField();
        add(txtbirthdate).setBounds(95,250,150,20);


        JLabel lblparent = new JLabel("Parent/");
        add(lblparent).setBounds(30,235,50,100);
        JLabel lblguardian = new JLabel("Guardian:");
        add(lblguardian).setBounds(30,250,60,100);
        JTextField txtparent = new JTextField();
        add(txtparent).setBounds(95,275,150,35);


        JLabel lblcontact = new JLabel("Contact");
        add(lblcontact).setBounds(30,275,55,100);
        JLabel lblnumber = new JLabel("Number:");
        add(lblnumber).setBounds(30,290,55,100);
        JTextField txtcontact = new JTextField();
        add(txtcontact).setBounds(95,315,150,35);
        

        JLabel lblschool = new JLabel("Previous School Attended:");
        add(lblschool).setBounds(310,60,160,100);
        JTextField txtschool = new JTextField();
        add(txtschool).setBounds(470,100,150,20);


        JLabel lblgwa = new JLabel("GWA/Final Grade:");
        add(lblgwa).setBounds(310,85,160,100);
        JTextField txtgwa = new JTextField();
        add(txtgwa).setBounds(470,125,150,20);


        JButton btnsave = new JButton("Save");
        add(btnsave).setForeground(Color.BLACK);
        add(btnsave).setBackground(new Color(0x21BF73));
        add(btnsave).setBounds(580,410,80,30);


        JButton btncancel = new JButton("Cancel");
        add(btncancel).setForeground(Color.BLACK);
        add(btncancel).setBackground(new Color(0xF8485E));
        add(btncancel).setBounds(490,410,80,30);

        String imagePath = "C:\\Users\\User\\IdeaProjects\\CCE 107 ProjectsActivity\\src\\images\\judie.png";
        ImageIcon Logo = new ImageIcon(imagePath);

        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter fw = new FileWriter(FILE_NAME, true);
                     BufferedWriter bw = new BufferedWriter(fw)) {
                    String name = txtfullname.getText();
                    String age = txtage.getText();
                    String gender = (String) comboBox.getSelectedItem();
                    String program = txtprogram.getText();
                    String address = txtaddress.getText();
                    String email = txtemail.getText();
                    String birthDate = txtbirthdate.getText();
                    String parent = txtparent.getText();
                    String contact = txtcontact.getText();
                    String school = txtschool.getText();
                    String grade = txtgwa.getText();
                    bw.write(name + DELIMITER + age + DELIMITER + gender +DELIMITER + program+ DELIMITER +address+ DELIMITER +email+
                            DELIMITER +birthDate+ DELIMITER +parent+ DELIMITER +contact+ DELIMITER +school+ DELIMITER +grade);
                    bw.newLine();
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(null,"Error writing to file " + e1.getMessage());
                }
                JOptionPane.showMessageDialog(null, "Saved Successfully!");

            }
        });
        btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Thank you for using our system. Goodbye!");
                System.exit(0);
            }
        });


        setUndecorated(false);
        setResizable(true);
        setIconImage(Logo.getImage());
        setTitle("Jude's Academy");
        setLayout(null); // Manually set the size/position of each componentA
        setSize(700,500); // GUI frame
        setLocationRelativeTo(null); // GUI is at the center (default)
        setVisible(true); // GUI is visible
        getContentPane().setBackground(new Color(0xFAF5E4));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        new Lab_Act4_StudentEnrollmentGUI();
    }
}


