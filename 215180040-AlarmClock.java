/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itse421;

/**
 *
 * @author ahmed
 */
import java.text.DecimalFormat;

public class AlarmClock {

    // Fields
    private int currentHour;
    private int currentMin;
    private int currentSec;
    private int alarmHour;
    private int alarmMin;
    private String label;
    private String ringtone;
    private boolean alarmOn;
    private boolean displayIn24;

    // Methods

    // Constructor
    public AlarmClock() {
            currentHour = alarmHour = currentMin = currentSec = alarmMin = 0;
            alarmOn = false;
            displayIn24 = true;
            label = "Wake Up !";
            ringtone = "Default";
    }

    public void setTime(int hour, int min, int sec) {
            currentHour = hour;
            currentMin = min;
            currentSec = sec;
    }

    public void tick() {
            // 1. increase seconds by 1
            currentSec++;
            // 2. check if seconds == 60
            if(currentSec == 60) {
                    // if so, min++ and sec = 0
                    currentSec = 0;
                    currentMin++;

            }
            if(currentMin == 60) {
                    // if so, min++ and sec = 0
                    currentMin = 0;
                    currentHour++;

            }
            if(currentHour == 24) {
                    // if so, min++ and sec = 0
                    currentHour = 0;
            }
            checkAlarm();

            // 3. check if min == 60
            // if so, hour++ and min = 0
            // 4. check if hour = 24
            // if so, hour = 0
            // check current time vs. alarm time then sound alarm

    }

    public void checkAlarm() {
            // if alarm is going to sound, print something to screen
            if(alarmOn && currentHour == alarmHour && currentMin == alarmMin) {
                    System.out.println(label + "/nWith sound : " + ringtone);
            }

    }

    public void displayTime() {

            DecimalFormat fmt = new DecimalFormat("00");
            System.out.println(fmt.format(currentHour) + ":"
                            + fmt.format(currentMin) + ":" + fmt.format(currentSec));

    }

    @Override
    public String toString() {
        return "AlarmClock [currentHour=" + currentHour + ", currentMin="
                        + currentMin + ", currentSec=" + currentSec + ", alarmHour="
                        + alarmHour + ", alarmMin=" + alarmMin + ", alarmOn=" + alarmOn
                        + ", Label=" + label + ", Ringtone=" + ringtone
                        + ", displayIn24=" + displayIn24 + "]";
    }

    public int getCurrentHour() {
            return currentHour;
    }

    public void setCurrentHour(int currentHour) {
            this.currentHour = currentHour;
    }

    public int getCurrentMin() {
            return currentMin;
    }

    public void setCurrentMin(int currentMin) {
            this.currentMin = currentMin;
    }

    public int getCurrentSec() {
            return currentSec;
    }

    public void setCurrentSec(int currentSec) {
            this.currentSec = currentSec;
    }

    public int getAlarmHour() {
            return alarmHour;
    }

    public void setAlarmHour(int alarmHour) {
            this.alarmHour = alarmHour;
    }

    public int getAlarmMin() {
            return alarmMin;
    }

    public void setAlarmMin(int alarmMin) {
            this.alarmMin = alarmMin;
    }

    public boolean isAlarmOn() {
            return alarmOn;
    }

    public void setAlarmOn(boolean alarmOn) {
            this.alarmOn = alarmOn;
    }

    public boolean isDisplayIn24() {
            return displayIn24;
    }

    public void setDisplayIn24(boolean displayIn24) {
            this.displayIn24 = displayIn24;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }
        
        

}
