/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author Hellau
 */
public class TV {
    private String power;
    private int ch;
    private int vol;
    
    public TV(){
        power = "OFF";
        ch = 0;
        vol = 0;
    }
    public TV(String power, int ch, int vol){
        this.power = power;
        this.ch = ch;
        this.vol = vol;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
    public void printinfo(){
        System.out.println("Power"+getPower()
                          +"\nCahnnel = "+getCh()
                          +"\nVolume = "+getVol());
    }
    
}
