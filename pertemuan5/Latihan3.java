
package pertemuan_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ainan
 */
// ini baris turunan JFrame menggunakan kelas untuk menampilkan GUI
public class Latihan3 extends JFrame {
    private boolean CheckBoxSelected; //ini untuk memastikan checkbox dipilih atau tidak
    
    public Latihan3() { //konstruktor
        this.CheckBoxSelected = false; // ini untuk menginisialisasi CheckBoxSelected menggunakan false
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ini untuk membuat tampilan keluar
        
       JLabel labelInput = new JLabel("Nama : "); // ini untuk menampilkan teks 
       labelInput.setBounds(15, 40, 350, 10); // ini untuk mengatur posisi dan ukuran label 
       
       JTextField textFieldNama = new JTextField(); // ini untuk memasukkan nama
       textFieldNama.setBounds(15,60,350,30);
       
       JLabel labelTelepon = new JLabel("No HP : ");
       labelTelepon.setBounds(15, 100, 350, 10);
       
       JTextField textFieldTelepon = new JTextField();
       textFieldTelepon.setBounds(15,120,350,30);
        
       JLabel labelRadio = new JLabel("Jenis Kelamin : ");
       labelRadio.setBounds(15,160,140,10);
       
       JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);
       radioButton1.setBounds(15,190,350,30);
       
       JRadioButton radioButton2 = new JRadioButton("Perempuan");
       radioButton2.setBounds(15,220,350,30);  
       
       // Ini untuk memilih button
       ButtonGroup bg = new ButtonGroup();
       bg.add(radioButton1);
       bg.add(radioButton2);
       
       JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
       checkBox.setBounds(15,250,350,30);
       
       JButton button = new JButton("Simpan");
       button.setBounds(15,290,100,40);
       
       JTextArea txtOutput = new JTextArea("");
       txtOutput.setBounds(15,340,350,100);
       
// ini untuk memastikan saat memilih button
        checkBox.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
            CheckBoxSelected = e.getStateChange()==1;
        }
    });
        
       // ini untuk membuat aksi saat memilih
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               // ini untuk memilih jenis kelamin
               String jenisKelamin = "";
               if(radioButton1.isSelected()) { 
                   jenisKelamin = radioButton1.getText();
               }
               if(radioButton2.isSelected()) {
                   jenisKelamin = radioButton2.getText();
               }
               
       
                   String nama = textFieldNama.getText();
                   String Telepon = textFieldTelepon.getText();
                  
                   // ini untuk menampilkan output dari input
                   txtOutput.append("Nama              : " + nama + "\n" + "Nomor HP       : " +Telepon + "\n" + "Jenis Kelamin : " + jenisKelamin + "\n");
                   textFieldNama.setText("");
                   textFieldTelepon.setText("");
                   
                 
                 if (CheckBoxSelected) {
                   txtOutput.append("WNA : " + "Ya\n");
               }else {
                   txtOutput.append("WNA : " + "Bukan\n");
               }
               txtOutput.append("==============================\n");
               // ini untuk mengosongkan setelah informasi di tampilkan
               textFieldNama.setText("");
               textFieldTelepon.setText("");
               checkBox.setSelected(false);
               
             
           }
         
       });
      
       // Ini untuk menambahkan semua komponen GUI ke dalam frame
       this.add(button);
        this.add(radioButton1);
       this.add(radioButton2);
       this.add(textFieldNama);
       this.add(textFieldTelepon); 
       this.add(checkBox);
       this.add(labelInput);
       this.add(labelRadio);
       this.add(labelTelepon);
       this.add(txtOutput);
       
       this.setSize(400,500);
       this.setLayout(null);
       
    
       }
    
    // ini untuk mengatur menjadi terlihat dan operasi penggunaan swing akan dijalankan.
     public static void main(String[] args) {
           javax.swing.SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                   Latihan3 g = new Latihan3();
                   g.setVisible(true);
               }
           });          
    }
}
