package controller;

import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class EnrollmentSet {

    private final JFrame jf;
    private final JTextField jtfRut, jtfRutDigit, jtfName, jtfAge;
    private final JTextArea jtaAddress;
    private final JSlider jsAge;
    private final JRadioButton jrbM, jrbF, jrbNI;
    private final ButtonGroup bgSex;

    public EnrollmentSet(JFrame jf, JTextField jtfRut, JTextField jtfRutDigit, JTextField jtfName, JTextField jtfAge, JTextArea jtaAddress, JSlider jsAge, JRadioButton jrbM, JRadioButton jrbF, JRadioButton jrbNI, ButtonGroup bgSex) {
        this.jf = jf;
        this.jtfRut = jtfRut;
        this.jtfRutDigit = jtfRutDigit;
        this.jtfName = jtfName;
        this.jtfAge = jtfAge;
        this.jtaAddress = jtaAddress;
        this.jsAge = jsAge;
        this.jrbM = jrbM;
        this.jrbF = jrbF;
        this.jrbNI = jrbNI;
        this.bgSex = bgSex;
    }

    public void setAll() {
        Dimension d = new Dimension(350, 345);

        jf.setSize(d);
        jf.setTitle(AppResource.TITLE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(false);
        
        jtfRut.setEditable(true);
        jtfRutDigit.setEditable(false);
        jtfName.setEditable(false);
        jtfAge.setEditable(false);
        jsAge.setEnabled(false);
        jtaAddress.setEditable(false);

        bgSex.add(jrbM);
        bgSex.add(jrbF);
        bgSex.add(jrbNI);

        jrbM.setSelected(true);
        jrbM.setEnabled(false);
        jrbF.setEnabled(false);
        jrbNI.setEnabled(false);
    }
}
