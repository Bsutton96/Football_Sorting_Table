//Created by Benjamin Sutton BKS5702@psu.edu
package View;

import javax.swing.*;

public class InitialPanel extends JPanel {   

    private CenterPanel cp;
  

    public InitialPanel() {

        cp = new CenterPanel();
        add(cp);
    }
  
    public CenterPanel getCp() {

        return cp;
    }
  
    public void setCp(CenterPanel cp) {

        this.cp = cp;
    }
}