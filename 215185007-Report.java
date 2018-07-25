package Repot;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pb
 */
public class A{


    private int userId;
    private String reportTitle ;
    private String reportdescription;
    private String date;
    private int reportId;
    
    public Note() {
        isAlarmSet = false;
    }
    

    public String getreportTitle () {
        return reportTitle ;
    }


    public void setreportTitle (String reportTitle ) {
        this.reportTitle  = reportTitle ;
    }


    public String getreportdescription() {
        return reportdescription;
    }


    public void setreportdescription(String reportdescription) {
        this.reportdescription = reportdescription;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

  public int getreportId() {
        return reportId;
    }

    public void setreportId(int reportId) {
        this.reportId = reportId;
    }

  
    public String getdate() {
        return date;
    }

 
    public void setdate(String date) {
        this.date = date;
    }
} 
}