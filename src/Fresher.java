/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ttaad
 */
import java.util.Scanner;
public class Fresher extends Candidates {
    private String graduationDate;
    private String graduationRank;
    public Fresher() {
        super();
    }

    public Fresher(String graduationDate, String graduationRank, String id,
            String firstName, String lastName, int birthDate, String address,
            String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }
 
    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("graduationDate: ");
        this.graduationDate=sc.nextLine();
        while(true){
            try{
                System.out.println("graduationRank: ");
                String a= sc.nextLine();
                if(a.compareTo("Excellence")==0||a.compareTo("Good")==0||a.compareTo("Fair")==0||a.compareTo("Poor")==0){
                    this.graduationRank=a;
                    break;
                } else {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
   
