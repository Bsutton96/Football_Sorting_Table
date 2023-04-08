//Created by Benjamin Sutton BKS5702@psu.edu
package View;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class View {

    private InitialFrame initf;
  
    public View() {

        initf = new InitialFrame();
        initf.getInitialPanel();
    }

    public InitialFrame getInitialFrame() {

        return initf;
    }


    public void setInitialFrame(InitialFrame initf) {

        this.initf = initf;
    }
  
    public void CenterInitialSetup(int noLines, int size) {
        
        initf.getInitialPanel().getCp().setNumberLines(noLines);
        initf.getInitialPanel().getCp().setNumberColumns(size);
        initf.getInitialPanel().getCp().displayTable();
    }
  
    public void CenterUpdate(ArrayList<ArrayList<String>> tuples, ArrayList<String> header) {

        for(int i=0; i<header.size(); i++) {

            initf.getInitialPanel().getCp().buttonArrayHeader.get(i).setText(header.get(i));
        }
  
        for(int i=0; i<20; i++) {
            
            for(int j=0; j<header.size(); j++) {

                String str = tuples.get(i).get(j);

                if(str.length()>18) str = str.substring(0,18);
                initf.getInitialPanel().getCp().buttonArray.get(i*header.size()+j).setText(str);
                getInitialFrame().getInitialPanel().getCp().validate();
                getInitialFrame().getInitialPanel().getCp().repaint();
            }
        }
    }
}

