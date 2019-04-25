package controller;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class EnrollmentSet {
    
    private final JFrame jf;

    public EnrollmentSet(JFrame jf) {
        this.jf = jf;
    }
    
    public void setAll(){
        Dimension d = new Dimension(345, 345);
        jf.setLocationRelativeTo(null);
        jf.setSize(d);
        jf.setTitle(AppResource.TITLE);
        jf.setVisible(false);
    }
    
    
}
