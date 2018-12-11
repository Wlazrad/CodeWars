package few;

import java.util.Scanner;
class triangle{
    public static void main(String agrs[]){
        Scanner k = new Scanner (System.in);
        int line = k.nextInt();
        int x = (line *2) - 1;
        int y = 1 ;

        for(int l = 0; l < line; l++){

            for(int s = y; s > 0; s--){
                System.out.print("2");
            }

            for(int s = 0; s < x ; s++){
                System.out.print("1");
            }

            System.out.println();
            x-=2;
            y+=1;
        }
    }
}