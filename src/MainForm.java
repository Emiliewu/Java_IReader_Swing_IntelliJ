import javax.swing.event.*;
import com.imooc.ireader.utils.TTS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Sep 15 23:49:21 PDT 2021
 */



/**
 * @author Emilie
 */
public class MainForm extends JPanel {
    private int speed = 50;
    private int volumn = 50;
    private void doTTS(String voiceName) {
        // play btnMale
        String text = this.areaText.getText();
        if(text.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "cannot be empty", "warnning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        TTS tts = new TTS();
        tts.appid = "52f9ca6a";
        tts.apiKey = "f9cbc3d84edf8ed5bfca495193003050";
        tts.apiSecret = "MTk1MTM4ODc2NWE5NTlhYmE5NTcxZDc0";
        tts.voiceLocation = "d:/temp/voice";
        String authUrl = tts.getAuthUrl();
        String filePath = tts.startDoTTS(authUrl, text, voiceName, this.speed, this.volumn);
        tts.play(filePath);
        System.out.println("Volumn: "+this.volumn);
        System.out.println("Speed: "+this.speed);
    }

    public MainForm() {
        initComponents();
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(900, 790);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setContentPane(new MainForm());
        jFrame.setTitle("EmilieIReader");
        jFrame.setVisible(true);
    }

    private void btnMaleMouseClicked(MouseEvent e) {
       this.doTTS("aisjiuxu");
    }

    private void sldSpeedStateChanged(ChangeEvent e) {
        // TODO add your code here
        this.speed = this.sldSpeed.getValue();
    }

    private void sldVolumnStateChanged(ChangeEvent e) {
        // TODO add your code here
        this.volumn = this.sldVolumn.getValue();
    }

    private void btnFemaleMouseClicked(MouseEvent e) {
        // TODO add your code here
        this.doTTS("xiaoyan");
    }

    private void btnHenanMouseClicked(MouseEvent e) {
        // TODO add your code here
        this.doTTS("aisbabyxu");
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Emilie
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        areaText = new JTextArea();
        label2 = new JLabel();
        label3 = new JLabel();
        sldSpeed = new JSlider();
        sldVolumn = new JSlider();
        btnFemale = new JButton();
        btnHenan = new JButton();
        btnMale = new JButton();

        //======== this ========
        setBackground(new Color(51, 51, 51));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
        setLayout(null);

        //---- label1 ----
        label1.setText("File");
        label1.setFont(new Font("Arial Black", Font.BOLD, 14));
        label1.setForeground(Color.white);
        add(label1);
        label1.setBounds(45, 40, 50, 24);

        //---- textField1 ----
        textField1.setBackground(Color.white);
        add(textField1);
        textField1.setBounds(110, 35, 605, 35);

        //---- button1 ----
        button1.setText("submit");
        button1.setBackground(new Color(8, 145, 224));
        button1.setForeground(Color.white);
        add(button1);
        button1.setBounds(730, 35, 105, 35);

        //======== scrollPane1 ========
        {

            //---- areaText ----
            areaText.setBackground(Color.white);
            areaText.setFont(new Font("Calibri Light", Font.PLAIN, 32));
            scrollPane1.setViewportView(areaText);
        }
        add(scrollPane1);
        scrollPane1.setBounds(25, 85, 845, 370);

        //---- label2 ----
        label2.setText("Speed");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label2.setForeground(Color.white);
        add(label2);
        label2.setBounds(140, 470, 60, 24);

        //---- label3 ----
        label3.setText("volumn");
        label3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label3.setForeground(Color.white);
        add(label3);
        label3.setBounds(140, 505, 60, 24);

        //---- sldSpeed ----
        sldSpeed.addChangeListener(e -> sldSpeedStateChanged(e));
        add(sldSpeed);
        sldSpeed.setBounds(220, 475, 530, 24);

        //---- sldVolumn ----
        sldVolumn.addChangeListener(e -> sldVolumnStateChanged(e));
        add(sldVolumn);
        sldVolumn.setBounds(220, 510, 530, 24);

        //---- btnFemale ----
        btnFemale.setIcon(new ImageIcon(getClass().getResource("/images/btn_female.png")));
        btnFemale.setBackground(Color.white);
        btnFemale.setOpaque(false);
        btnFemale.setBorderPainted(false);
        btnFemale.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
                btnFemaleMouseClicked(e);
            }
        });
        add(btnFemale);
        btnFemale.setBounds(400, 570, 100, 100);

        //---- btnHenan ----
        btnHenan.setIcon(new ImageIcon(getClass().getResource("/images/btn_henan.png")));
        btnHenan.setBackground(Color.white);
        btnHenan.setForeground(Color.white);
        btnHenan.setOpaque(false);
        btnHenan.setBorderPainted(false);
        btnHenan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnHenanMouseClicked(e);
            }
        });
        add(btnHenan);
        btnHenan.setBounds(550, 570, 100, 100);

        //---- btnMale ----
        btnMale.setIcon(new ImageIcon(getClass().getResource("/images/btn_male.png")));
        btnMale.setOpaque(false);
        btnMale.setBackground(Color.white);
        btnMale.setBorderPainted(false);
        btnMale.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnMaleMouseClicked(e);
            }
        });
        add(btnMale);
        btnMale.setBounds(254, 570, 100, 100);

        setPreferredSize(new Dimension(900, 780));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Emilie
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextArea areaText;
    private JLabel label2;
    private JLabel label3;
    private JSlider sldSpeed;
    private JSlider sldVolumn;
    private JButton btnFemale;
    private JButton btnHenan;
    private JButton btnMale;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
