
import java.util.List;

public class ManageFres {
       public int check(List<Fresher>a,String id){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getId().compareTo(id)==0){
                return 0;
            }
        }
        return 1;
    }
       public void create(List<Fresher>a){
        Fresher b= new Fresher();
        b.input();
        if(check(a,b.getId())==1){
            a.add(b);
            System.out.println("create success !");
        } else {
            System.out.println("this candidate has exist !");
        }
        
    }
        public void search(List<Fresher>a,String name){
            int count=0;
        for(int i=0;i<a.size();i++){
          if(a.get(i).getFirstName().toLowerCase().contains(name.toLowerCase())||a.get(i).getLastName().toLowerCase().contains(name.toLowerCase())){
          System.out.println(a.get(i).toString());
            } else {
                count++;
            }
        }
        if(count==a.size()){
            System.out.println("not found this candidate");
        }
    }
}
