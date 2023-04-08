//Created by Benjamin Sutton BKS5702@psu.edu
package View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class CenterPanel extends JPanel {
    
    public ArrayList<JButton> buttonArrayHeader;
    ArrayList<JButton> buttonArray;
    private int numberColumns;
    private int numberLines;
  
  
  

    public CenterPanel() {
        super();
        setPreferredSize(new Dimension(1120, 680));
        buttonArrayHeader = new ArrayList<>(); // creates the ArrayList of RandomButton
        buttonArray = new ArrayList<>(); // creates the ArrayList of RandomButton   
    }
  


    public void displayTable() {
        setBackground(Color.darkGray);
        setLayout(new GridLayout(numberLines + 1, numberColumns, 5, 5));

        JButton jbh[] = new JButton[numberColumns];
  
        for (int i = 0; i < numberColumns; i++) {

            jbh[i] = new JButton("");
            jbh[i].setBackground(Color.gray);
            jbh[i].setForeground(Color.black);
            jbh[i].setActionCommand(Integer.toString(i));

            buttonArrayHeader.add(jbh[i]); 
            add(buttonArrayHeader.get(i));
        }
  

        JButton jb[][] = new JButton[numberLines][numberColumns];
  
        for(int i=0; i<numberLines; i++) {

            for(int j=0; j<numberColumns; j++) {

                jb[i][j] = new JButton("");
                buttonArray.add(jb[i][j]); 
                add(buttonArray.get(i*numberColumns+j ));
            }
        }
    }
  

    public void setNumberColumns(int n) {

        numberColumns = n;
    }
  

    public void setNumberLines(int n){
        
        numberLines = n;
    }
}