package Kata;

public class Checkthreeandtwo {

    public static boolean checkThreeAndTwo(char[] chars) {

        int a=0;
        int b=0;
        int c=0;

        for (int i =0;i<chars.length;i++){
            if(chars[i]=='a')a++;
            if(chars[i]=='b')b++;
            if(chars[i]=='c')c++;
        }
        System.out.println((a==3 && b==2));
        return ((a==3 || b==3 || c==3)&&(a==2||b==2||c==2));

    }
}

