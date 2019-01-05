package FindTheParityOutlier;

public class FindTheParityOutlier {

    static int find(int[] integers){
        int liczba = 9;
            for ( int i = 0 ; i<integers.length-2; i++)
            {
              if((integers[i] % 2 ==0&&integers[i]% 2==0)||(integers[i+1] %2==0&&integers[i+2]==0))
              {
                  for (int j =0; j<integers.length;j++){
                      if (integers[j]%2!=0){
                          liczba=integers[j];
                      }

                  }
              }
                if((integers[i] % 2 !=0&&integers[i]% 2!=0)||(integers[i+1] %2!=0&&integers[i+2]!=0))
                {
                    for (int j =0; j<integers.length-2;j++){
                        if (integers[j]%2==0){
                            liczba=integers[j];
                        }

                    }
                }
            }

        return liczba;
    }

}
