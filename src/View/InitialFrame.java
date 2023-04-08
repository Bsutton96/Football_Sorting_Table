//Created by Benjamin Sutton BKS5702@psu.edu
package View;

import javax.swing.*;

public class InitialFrame extends JFrame {
    
    private InitialPanel ip;
  
    public InitialFrame() {

        super("Sorting Table - L05 - BKS5702");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip, "Center");
  


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1120, 680);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void setupLayoutForMacs() {
// On some MACs it might be necessary to have the statement below
//for the background color of the button to appear
        try {
        
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        
        } catch (Exception e) {
    
            e.printStackTrace();
    }

}



public InitialPanel getInitialPanel() {
    
    return ip;
}

public void setInitialPanel(InitialPanel ip) {

    this.ip = ip;
}
}