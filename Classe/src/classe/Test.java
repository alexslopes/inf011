/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Observer;
import javax.security.auth.Subject;

/**
 *
 * @author aluno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject Sandro = new Professor();
      
        Observer Alex = new Aluno(Sandro);
        Observer Flavio = new Aluno(Sandro);
        Observer Jonathan = new Aluno(Sandro);
        
        Sandro.AdcionarINF011(Flavio);
        Sandro.AdcionarINF011(Alex);
        Sandro.AdcionarINF011(Jonathan);
        
        System.out.println("Alex: " + Alex.observerState() + "/n" + 
                "Flavio: " + Flavio.observerState() + "/n" +
                "Jonathan: " + Jonathan.observerState()
        );
      
        
        Sandro.setState(true);
        
        System.out.println("Alex: " + Alex.observerState() + "/n" + 
                "Flavio: " + Flavio.observerState() + "/n" +
                "Jonathan: " + Jonathan.observerState()
        );
       
    }
    
}
