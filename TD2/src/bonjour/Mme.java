package TD2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mme extends Thread {
     
    @Override
    public void run(){
         
        try {  
            try (FileReader fr = new FileReader("C:\\Users\\Cristi\\Documents\\NetBeansProjects\\Bonjour\\ListPersonnes.txt"); 
                    BufferedReader br = new BufferedReader(fr)) {
                String line = br.readLine();
                
                while(line!=null){
                    if(line.charAt(1) == 'm')
                    {
                        try (PrintWriter writer = new PrintWriter("C:\\Users\\Cristi\\Documents\\NetBeansProjects\\Bonjour\\Bonjour.txt")) {
                            writer.println(line);
                            
                        }
                    }
                    
                    line = br.readLine();
                }
                

            }
        } catch (Exception ex) {
            Logger.getLogger(Mme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    
    
}
