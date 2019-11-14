import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {
    static int prev=0;
    static int curr=0;
    public static List<Integer> onesGroups(List<List<Integer>> grid, List<Integer> querie){
        LinkedList<LinkedList<Boolean>> visited=new LinkedList<>();
        int nsize=grid.size();
        for(int i=0;i<grid.size();i++){
            LinkedList<Boolean> temp=new LinkedList<>();
            for(int j=0;j<grid.size();j++){
                temp.add(false);
            }
            visited.add(temp);
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nsize;i++){
            for(int j=0;j<nsize;j++){
                
               if(grid.get(i).get(j)==1&&visited.get(i).get(j)==false){
                   dfs(i,j,grid,visited);
                   curr=curr+1;
                    int k=curr-prev;
                    int l=mp.get(k)==null?-1:mp.get(k);
                    int n=l==-1?1:l+1;
                    mp.put(k,n);
                    prev=curr;
                    
               } 
            }
        }
        List<Integer> result=new LinkedList<>();
        for(int i=0;i<querie.size();i++){
            result.add(mp.get(querie.get(i))==null?0:mp.get(querie.get(i)));
        }
        return result;
    }
    public static void dfs(int ind,int jnd,List<List<Integer>> grid,LinkedList<LinkedList<Boolean>> visited){
        visited.get(ind).set(jnd,true);
        if(jnd+1<grid.size()&&grid.get(ind).get(jnd+1)==1&&visited.get(ind).get(jnd+1)==false){
            curr++;
            dfs(ind,jnd+1,grid,visited);
        }
        if(jnd-1>=0&&grid.get(ind).get(jnd-1)==1&&visited.get(ind).get(jnd-1)==false){
            curr++;
            dfs(ind,jnd-1,grid,visited);
        }
        
        if(ind+1<grid.size()&&grid.get(ind+1).get(jnd)==1&&visited.get(ind+1).get(jnd)==false){
            curr++;
            dfs(ind+1,jnd,grid,visited);
        }
        
        if(ind-1>=0&&grid.get(ind-1).get(jnd)==1&&visited.get(ind-1).get(jnd)==false){
            curr++;
            dfs(ind-1,jnd,grid,visited);
        }    
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gridRows = Integer.parseInt(bufferedReader.readLine().trim());
        int gridColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> grid = new ArrayList<>();

        for (int i = 0; i < gridRows; i++) {
            String[] gridRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> gridRowItems = new ArrayList<>();

            for (int j = 0; j < gridColumns; j++) {
                int gridItem = Integer.parseInt(gridRowTempItems[j]);
                gridRowItems.add(gridItem);
            }

            grid.add(gridRowItems);
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = Integer.parseInt(bufferedReader.readLine().trim());
            queries.add(queriesItem);
        }

        List<Integer> result = Result.onesGroups(grid, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
