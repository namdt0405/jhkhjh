
import java.util.List;
public class ManageExp {
    public int check(List<Experience>a,String id){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getId().compareTo(id)==0){
                return 0;
            }
        }
        return 1;
    }
    public void create(List<Experience>a){
        Experience b= new Experience();
        b.input();
        if(check(a,b.getId())==1){
            a.add(b);
            System.out.println("Success!");
        } else {
            System.out.println("This candidate has exist !");
        }
        
    }
    public void search(List<Experience>a,String name){
        int count =0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).getFirstName().toLowerCase().contains(name.toLowerCase())||a.get(i).getLastName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(a.get(i).toString());
            } else {
                count++;
            }
        }
        if(count == a.size()){
            System.out.println("not found this candidate");
        }
    }
}
