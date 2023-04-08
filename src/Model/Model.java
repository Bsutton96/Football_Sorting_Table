//Created by Benjamin Sutton BKS5702@psu.edu
package Model;

import java.util.ArrayList;

public class Model {

    private FootballPlayerData fpData;

    public Model() {
        
        fpData = new FootballPlayerData();
    }

    public FootballPlayerData getFpData() {
        
        return fpData;
    }

    public void setFpData(FootballPlayerData fpData) {
        
        this.fpData = fpData;
    }
}
