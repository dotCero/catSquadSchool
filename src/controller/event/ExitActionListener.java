package controller.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cero
 */
public class ExitActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}
