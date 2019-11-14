import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {
    public static int countGroups(List<String> related) {
        LinkedList<LinkedList<Integer>> arr=new LinkedList<>();
        LinkedList<Boolean> visited=new LinkedList<>();
        for(int i=0;i<related.size();i++) visited.add(false);
        for(int i=0;i<related.size();i++){
            LinkedList<Integer> temp=new LinkedList<>();
            for(int j=0;j<related.get(i).length();j++){
                if(j!=i&&related.get(i).charAt(j)=='1'){
                    temp.add(j);
                }
            }
            arr.add(temp);
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(visited.get(i)==false){
                count++;
                dfs(i,visited,arr);
            }
        }
        return count;
    }
    public static void dfs(int ind,LinkedList<Boolean> visited, LinkedList<LinkedList<Integer>> arr){
        visited.set(ind,true);
        for(int i=0;i<arr.get(ind).size();i++){
            if(visited.get(arr.get(ind).get(i))==false){
                dfs(arr.get(ind).get(i),visited,arr);
            }
        }
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int relatedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> related = new ArrayList<>();

        for (int i = 0; i < relatedCount; i++) {
            String relatedItem = bufferedReader.readLine();
            related.add(relatedItem);
        }

        int result = Result.countGroups(related);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
