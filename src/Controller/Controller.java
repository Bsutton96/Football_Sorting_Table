//Created by Benjamin Sutton BKS5702@psu.edu
package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Controller
{

    Model model;
    View view;
    int maxLines;
    int n;
    
    
    public Controller(View v, Model m)
    {
        model = m;
        view = v;
        n = 0;
        
        model.getFpData().setLinesBeingDisplayed(20);
        model.getFpData().setFirstLineToDisplay(0);
        model.getFpData().setLastLineToDisplay(19);
        maxLines = model.getFpData().getMaxLines();
        
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(),
        model.getFpData().getHeaders().size());
  
        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
        model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
        
        
        
        addMouseListen();
        addScrollListener();
        

    }
    private void addListeners() {
        
        view.getInitialFrame().getInitialPanel().getCp().addMouseWheelListener(
                
                new MouseWheelListener() {
                    
                    @Override
                    public void mouseWheelMoved(MouseWheelEvent e) {
                        
                        int unitsToScroll = e.getUnitsToScroll();
                     
                        int m = model.getFpData().getLinesBeingDisplayed()-1;
                
                        n = n + unitsToScroll;
                
                        if(n + m > maxLines) {
                            n = n - unitsToScroll;
                        }
                
                        if(n < 0) {
                    
                            n = n- unitsToScroll;
                        }
                
                        model.getFpData().setFirstLineToDisplay(n);
                        model.getFpData().setLastLineToDisplay(n + m);
                        
                        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                        model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
                    }
                }
        );
    }

    private void addMouseListen()
    {
        for(int i=0; i<7; i++)
            {
                view.getInitialFrame().getInitialPanel().getCp().buttonArrayHeader.get(i).addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                        {
                            String ac = e.getActionCommand();
                            int j = Integer.parseInt(ac);
                            model.getFpData().SetSortField(j);
                            model.getFpData().sort();
  
                            view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                            model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
  
                        }
                }
                );
            }
    }


    private void addScrollListener() {
        view.getInitialFrame().getInitialPanel().getCp().addMouseWheelListener(
        
            new MouseWheelListener() {
                
                @Override
                public void mouseWheelMoved(MouseWheelEvent e) {
                    int unitsToScroll = e.getUnitsToScroll();
                    int m = model.getFpData().getLinesBeingDisplayed()-1;
                    n = n + unitsToScroll;
                    if(n + m >maxLines)
                    {
                        
                        n = n - unitsToScroll;
                    }
                    if(n<0)
                    {
                        n = n - unitsToScroll;
                    }
  
                    model.getFpData().setFirstLineToDisplay(n);
                    model.getFpData().setLastLineToDisplay(n + m);

                    view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                    model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
                }
            }
        );
    }
}
