package notesapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahmoud
 */
public class Note {

    private String noteTitle;
    private String noteDescription;
    private int userId;
    private boolean isAlarmSet;
    private String alarmDate;
    
    public Note() {
        isAlarmSet = false;
    }
    
    /**
     * @return the noteTitle
     */
    public String getNoteTitle() {
        return noteTitle;
    }

    /**
     * @param noteTitle the noteTitle to set
     */
    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    /**
     * @return the noteDescription
     */
    public String getNoteDescription() {
        return noteDescription;
    }

    /**
     * @param noteDescription the noteDescription to set
     */
    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the isAlarmSet
     */
    public boolean isIsAlarmSet() {
        return isAlarmSet;
    }

    /**
     * @param isAlarmSet the isAlarmSet to set
     */
    public void setIsAlarmSet(boolean isAlarmSet) {
        this.isAlarmSet = isAlarmSet;
    }

    /**
     * @return the alarmDate
     */
    public String getAlarmDate() {
        return alarmDate;
    }

    /**
     * @param alarmDate the alarmDate to set
     */
    public void setAlarmDate(String alarmDate) {
        this.alarmDate = alarmDate;
    }
    
    public void saveNote(Note note) {
        FileOutputStream out = null;
        ObjectOutputStream oout = null;
        try {
            out = new FileOutputStream("notes.txt");
            oout = new ObjectOutputStream(out);

            // write note in the file
            oout.writeObject(note);
            oout.flush();
            
        } catch (IOException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
                oout.close();
            } catch (IOException ex) {
                Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         
    }
    
}
