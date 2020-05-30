class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] arr=new int[k][2];
        double[] dis=new double[points.length];
        double[] bis=new double[points.length];
        for(int i=0;i<points.length;i++){
            dis[i]=Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
            bis[i]=dis[i];
        }
        Arrays.sort(dis);
        for(int i=0;i<k;i++){
            for(int j=0;j<points.length;j++){
                if(dis[i]==bis[j]){
                    arr[i][0]=points[j][0];
                    arr[i][1]=points[j][1];
                    bis[j]=Double.MAX_VALUE;
                    break;
                }
            }
        }
        return arr;
    }
}
