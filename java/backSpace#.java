import java.util.*;
public class Solution {
      public static String backspace(String s){
          int i=0;
          while(i!=s.length()){
              if(s.charAt(i)=='#'){
                  s=s.substring(0,i-1)+s.substring(i+1,s.length());
                  i--;
              }else{
                  i++;
              }
          }
          return s;
        }
}

