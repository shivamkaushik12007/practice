public class Solution {
    public String[] fizzBuzz(int A) {
        String s[]=new String[A];
        for(int i=1;i<=A;i++){
            if(i%3==0&&i%5==0)
                s[i-1]="FizzBuzz";
            else if(i%3==0)
                s[i-1]="Fizz";
            else if(i%5==0)
                s[i-1]="Buzz";
            else
                s[i-1]=Integer.toString(i);
        }
        return s;
    }
}
