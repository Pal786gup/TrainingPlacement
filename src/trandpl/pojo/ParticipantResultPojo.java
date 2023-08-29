/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.pojo;

/**
 *
 * @author dell
 */
public class ParticipantResultPojo extends ParticipantJobPojo{

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percrentage) {
        this.percentage = percrentage;
    }
    private double percentage;
    
}
