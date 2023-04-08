//Created by Benjamin Sutton BKS5702@psu.edu
package Model;

import java.util.ArrayList;

public interface TableData
{

    public void loadTable();

    public ArrayList<FootballPlayer> getTable();

    public ArrayList<String> getHeaders();

    public ArrayList<String> getLine(int line);

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

}
