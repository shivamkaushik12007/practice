//Run file By commands
//javac permutation.java
//java Permutation
//the program is taking input from input.csv file present in same folder as of file.


import java.util.*;
import java.lang.*;
public class Permutation{
    static ArrayList<String> res=new ArrayList<>();
	public static void main(String[] args){
	    String csvFile = "input.csv";
        String line = "";
        ArrayList<ArrayList<String>> arr=new ArrayList<>();
		try{
		    BufferedReader br=new BufferedReader(new FileReader(csvFile));
            while ((line=br.readLine())!=null) {
                String[] inp=line.split(",");
                ArrayList<String> temp=new ArrayList<>();
                for(int i=0;i<inp.length;i++){
                    temp.add(inp[i]);
                }
                arr.add(temp);
            }
            permutationCheck(arr,0,"");
            for(int i=0;i<res.size()-1;i++){
                System.out.print(res.get(i)+", ");
            }
            System.out.print(res.get(res.size()-1));
		}catch(IOException e){
		    e.printStackTrace();
		}
	}
	public static void permutationCheck(ArrayList<ArrayList<String>> arr,int level,String s){
	    if(level==arr.size()){
	        return;
	    }
	    s+=arr.get(level).get(0);
	    for(int i=0;i<arr.get(level).size();i++){
	        s=s.substring(0,s.length()-1);
	        s+=arr.get(level).get(i);
	        if(level==arr.size()-1){
	            res.add(s);
	        }else{
	            permutationCheck(arr,level+1,s);
	        }
	    }
	}
}
