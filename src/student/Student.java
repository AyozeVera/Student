/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Student {
    private String name;
    private Date birthDate;
    
    
    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    
    public int getAge(){
        Date today = new Date();
        return (int) getYearsInDays(
                getDaysInHours(
                getHoursInMinutes(
                getMinutesInSeconds(
                getSecondsInMiliseconds(
                today.getTime() - birthDate.getTime())))));
    
    }
    
    private long getSecondsInMiliseconds(long miliseconds){
        return miliseconds/1000;
    }
    
    private long getMinutesInSeconds(long seconds){
        return seconds/60;
    }
    
    private long getHoursInMinutes(long minutes){
        return minutes/60;
    }
    
    private long getDaysInHours(long hours){
        return hours/24;
    }
    
    private long getYearsInDays(long days){
        return (long) (days/365.25);
    }
    
}
