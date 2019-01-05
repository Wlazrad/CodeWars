package tribonacci;

public class tribonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] tri = new double[n];


        for (int i = 0; i < n; i++) {
            if (i == 0)
                tri[0] = s[0];
            if (i == 1) {
                tri[1] = s[1];
            }
            if (i == 2) {
                tri[2] = s[2];
            }


        }
        for(int i=3;i<n;i++){
            tri[i]=tri[i-3]+tri[i-2]+tri[i-1];

        }
        System.out.println(tri);
        return tri;
    }
}
