package controller;

import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class FormSet {

    private final JFrame jf;

    public FormSet(JFrame jf) {
        this.jf = jf;
    }

    public void undecorated() {
        jf.setUndecorated(true);
    }

    public void setAll() {

        jf.setTitle(AppResource.TITLE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

    }
}
