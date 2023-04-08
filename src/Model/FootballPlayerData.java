//Created by Benjamin Sutton BKS5702@psu.edu
package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.*;

public class FootballPlayerData implements TableData, Displayable, Sortable { 
    
    private ArrayList<FootballPlayer> players;
    protected int firstLineToDisplay;
    protected int lastLineToDisplay;
    protected int linesBeingDisplayed;
    protected int lineToHighlight;
    private int sortType;
    private int sortField;

    public FootballPlayerData()
    {
        players = new ArrayList<>();
        loadTable();
        firstLineToDisplay = 0;
        lastLineToDisplay = 0;
        linesBeingDisplayed = 0;
        lineToHighlight = 0;
        sortType = 0;
        sortField = 0;
        
    }

    public void ReadPlayersFromXML() {
        
        try {
            
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                
                try {
                    
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend) {
                    
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            
            xx.printStackTrace();
        }
    }
    
        @Override
    public void loadTable() {
        
        ReadPlayersFromXML();
    }
    
    @Override
    public ArrayList<String> getHeaders() {

        ArrayList<String> header;
  
        FootballPlayer fp = new FootballPlayer();
  
        header = fp.getAttributeNames();
  
        return header;
    }
    
    @Override
    public ArrayList<String> getLine(int line) {

        ArrayList<String> tuple;
  
        tuple = players.get(line).getAttributes();
  
        return tuple;
    }
    
    @Override
    public ArrayList<FootballPlayer> getTable() {

        return players;
    }
    
    
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {

        ArrayList<ArrayList<String>> tuples = new ArrayList<>();
  
        for(int i=firstLine; i<=lastLine; i++) {

            tuples.add(getLine(i));
        }

        return tuples;
    }
    
        @Override
    public int getFirstLineToDisplay() { 
        
            return this.firstLineToDisplay; 
            
    }

    @Override
    public int getLineToHighlight() {
        
            return this.lineToHighlight;
            
    }

    @Override
    public int getLastLineToDisplay() {
        
            return this.lastLineToDisplay;
            
    }

    @Override
    public int getLinesBeingDisplayed() {
        
            return this.linesBeingDisplayed;
            
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {

            int m = this.getLinesBeingDisplayed();
            if(firstLine<0) firstLine = 0;
            if(firstLine>players.size()-m) firstLine = players.size()-m;
            this.firstLineToDisplay = firstLine;
            
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        
            this.lineToHighlight = highlightedLine;
            
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {

        int m = this.getLinesBeingDisplayed();
        if(lastLine>players.size()-1) lastLine = players.size() - 1 ;
        if(lastLine<m-1) lastLine = m - 1;
  
        this.lastLineToDisplay = lastLine;
                
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
            linesBeingDisplayed = numberOfLines;
    }
    
    public int getMaxLines() {
        return players.size();
    }  
    
    @Override
    public void sort() {
        
        int sortField = getSortField();
        
        if(sortField==0) {
            
            Comparator<FootballPlayer> field = new Comparator<FootballPlayer>() {
                
                public int compare(FootballPlayer f1, FootballPlayer f2) {
                    
                    int x = Integer.parseInt(f1.getAttribute(0));
                    int y = Integer.parseInt(f2.getAttribute(0));
                    return x-y;
                }
            };
            
            Collections.sort(players,field);
        }
        else {
            
            Comparator<FootballPlayer> field = new Comparator<FootballPlayer>() {

                public int compare(FootballPlayer f1, FootballPlayer f2) {

                    return f1.getAttribute(sortField).compareTo(f2.getAttribute(sortField));

                }

            };


            Collections.sort(players, field);
            
        }
    }
    
    public int getSortField() {

        return sortField;

    }


    public void SetSortField(int sortField) {

        this.sortField = sortField;

    }


}

