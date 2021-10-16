
import java.util.ArrayList;
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
public class Main {
    public static void main(String[] args) {
        List<Experience> a = new ArrayList<Experience>();
        Manage_EX b= new Manage_EX();
        b.create(a);
        System.out.println(a.get(0));
    }
}
