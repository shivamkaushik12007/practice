static String angryProfessor(int k, int[] a) {
        int cnt=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0){
                cnt++;
            }
        }
        if(cnt>=k)
            return "NO";
        return "YES";

    }
