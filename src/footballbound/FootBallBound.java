/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballbound;
import java.util.*;
/**
 *
 * @author price
 */
public class FootBallBound {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LiveScoreBean live = new LiveScoreBean();
        Subcriber sub = new Subcriber();
        System.out.print("Regritant : ");
        int people = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < people ; i++) live.addPropertyChangeListener(sub);
        while(true){
            System.out.print("Enter Score : ");
            String s = sc.nextLine();
            if (!s.equals("")){
                live.setScoreLine(s);
            }
            else break; 
        }
        
            
    }
    
}
