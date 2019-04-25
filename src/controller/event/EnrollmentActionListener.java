package controller.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author cero
 */
public class EnrollmentActionListener implements ActionListener{
    
    JFrame jfPortrait, jfEnrollment;

    public EnrollmentActionListener(JFrame jfPortrait, JFrame jfEnrollment) {
        this.jfPortrait = jfPortrait;
        this.jfEnrollment = jfEnrollment;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jfPortrait.setVisible(false);
        jfEnrollment.setVisible(true);
    }
    
}
