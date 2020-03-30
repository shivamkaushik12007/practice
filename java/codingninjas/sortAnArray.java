import java.util.*;
import java.lang.*;
public class Solution { 
	public static void main(String[] args) 
	{ 
		// Write your code here
        Scanner scanner=new Scanner(System.in);
        Map<Integer,Integer> mp=new HashMap<>();
        int n=scanner.nextInt();
        // int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            if(mp.get(temp)==null){
                mp.put(temp,1);
            }else{
                mp.put(temp,mp.get(temp)+1);
            }
        }
        ArrayList<Exam> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> l:mp.entrySet()){
            Exam temp=new Exam(l.getKey(),l.getValue());
            arr.add(temp);
        }
        Collections.sort(arr,new Sortm());
        for(int i=0;i<arr.size();i++){
            // System.out.println(arr.get(i).k1+" "+arr.get(i).k2);
            // int n1=arr.get(i).k1;
            // int n2=arr.get(i).k2;
            for(int j=0;j<arr.get(i).k2;j++){
                System.out.print(arr.get(i).k1+" ");
            }
        }
	}
} 
class Exam{
    int k1;
    int k2;
    Exam(int l1,int l2){
        this.k1=l1;
        this.k2=l2;
    }
}

class Sortm implements Comparator<Exam>{
    public int compare(Exam k1,Exam k2){
        if(k1.k2==k2.k2){
            return k1.k1-k2.k1;
        }else{
            return k2.k2-k1.k2;
        }
    }
    
} 
