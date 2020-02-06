//run the program with command
//javac WordSuggestion.java
//java WordSuggestion inputFile.csv wordToCheck
import java.util.*;
import java.lang.*;
public class WordSuggestion{
    ArrayList<String> res=new ArrayList<>();
	public static void main(String[] args){
	String csvFile = args[0];
        String line = "";
        String word=args[1];
        int size=word.length();
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Thing> res=new ArrayList<>();
		try{
		    BufferedReader br=new BufferedReader(new FileReader(csvFile));
            while ((line=br.readLine())!=null) {
                String[] inp=line.split(",");
                arr1.add(inp[0]);
                inp[1]=inp[1].trim();
                arr2.add(Integer.parseInt(inp[1]));
            }
            for(int i=0;i<arr1.size();i++){
                if(arr1.get(i).length()==size){
                    int k=check(arr1.get(i),word);
                    Thing t=new Thing(arr1.get(i),arr2.get(i),k);
                    res.add(t);
                }
            }
            Collections.sort(res,new Comparator<Thing>(){
              public int compare(Thing t1,Thing t2){
                  if(t1.diff==t2.diff){
                      return t2.freq-t1.freq;
                  }
                  return t1.diff-t2.diff;
              }  
            });  
            int resNum=0;
            while(resNum<4&&resNum<res.size()){
                System.out.println(res.get(resNum).s+", ");
                resNum++;
            }
            if(res.size()>=5){
                System.out.println(res.get(resNum).s);
            }
		}catch(IOException e){
		    e.printStackTrace();
		}
	}
	public static int check(String s,String word){
	    int arr[][]=new int[s.length()+1][word.length()+1];
	    for(int i=1;i<=s.length();i++){
	        for(int j=1;j<=word.length();j++){
	            if(s.charAt(i-1)==word.charAt(j-1)){
	                arr[i][j]=arr[i-1][j-1];
	            }else{
	                int k1=arr[i-1][j]<arr[i-1][j-1]?arr[i-1][j]:arr[i-1][j-1];
	                int k2=arr[i][j-1]<arr[i-1][j-1]?arr[i][j-1]:arr[i-1][j-1];
	                int k=k1<k2?k1:k2;
	                arr[i][j]=k+1;
	            }
	        }
	    }
	    return arr[s.length()][word.length()];
	}
}
class Thing{
    String s;
    int freq;
    int diff;
    public Thing(String s,int freq,int diff){
        this.s=s;
        this.freq=freq;
        this.diff=diff;
    }
}
