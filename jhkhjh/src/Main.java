
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Experience> a = new ArrayList<>();
    List<Fresher> b= new ArrayList<>();
    List<Internship> c= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("CANDIDATE MANAGEMENT SYSTEM");
    System.out.println("1. Experience");
    System.out.println("2. Fresher");
    System.out.println("3. Internship");
    System.out.println("4. Searching");
    System.out.println("5. Exit");
    
    int checkpoint=1;
    while(checkpoint==1){
      int choice;
      while(true){
        try{
          System.out.print("Chose case from 1 to 5: ");
          choice=Integer.parseInt(sc.nextLine());
          if(choice>=1&&choice<=5) break;
          else throw new Exception();
        }catch(Exception e){
          System.out.println("Wrong pattern!! Please choose again!!");
        }
      }
      switch (choice){
        case 1:
          ManageExp e1 = new ManageExp();
          e1.create(a);
          break;
        case 2:
          ManageFres f1=new ManageFres();
          f1.create(b);
          break;
        case 3:
          ManageInter i1= new ManageInter();
          i1.create(c);
          break;
        case 4:
          System.out.println("===========EXPERIENCE CANDIDATE============");
          for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).getFirstName()+" "+a.get(i).getLastName());
          }
          System.out.println("===========FRESHER CANDIDATE==============");
          for(int i=0;i<b.size();i++){
            System.out.println(b.get(i).getFirstName()+" "+b.get(i).getLastName());
          }
          System.out.println("===========INTERN CANDIDATE==============");
          for(int i=0;i<c.size();i++){
            System.out.println(c.get(i).getFirstName()+" "+c.get(i).getLastName());
          }
          System.out.print("Input Candidate name (First name or Last name): ");
          String name=sc.nextLine().trim();
          int type =-1;
          while(true){
          try{
            System.out.print("Input type of candidate: ");
            type=Integer.parseInt(sc.nextLine());
            if(type>=0&&type<=2)break;
            else throw new Exception();
           }catch(Exception e){
             System.out.println(e);
           }

          }
          if(type==0){
            ManageExp ex2 = new ManageExp();
            ex2.search(a, name);
          } else if(type ==1){
            ManageFres fres2=new ManageFres();
            fres2.search(b, name);
          } else {
            ManageInter intern2= new ManageInter();
            intern2.search(c, name);
          }
          break;
        case 5:
          checkpoint=0;
          break;
      }
    }
  }
}
