/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;
import javax.swing.*;
/**
 *
 * @author 18.zach.sylvester
 */
public class Chatbot extends JFrame {
    public Chatbot(){
        super("testing");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel() (
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            
            );
        } catch (Exception exc){
            
            
        }
        
    }
    public static void main(String[] arguments) {
    SalutonFrame frame = new Chatbot();
    }
}


