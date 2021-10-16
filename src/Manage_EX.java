
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ttaad
 */
public class Manage_EX {
    public void create(List<Experience>a){
        //String birth=b.getBirthDate();
        Experience b= new Experience();
        b.input();
        a.add(b);
    }
}
