    static void extraLongFactorials(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        System.out.println(f);
    }
