package CountingDuplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CountingDuplicates {

    public static int dupicateCount(String text){
        String newtext = text.toLowerCase();
        int duplicate =0;
        Set lista1= new TreeSet();
        char[] tab =newtext.toCharArray();
        for (int i = 0; i<tab.length;i++) {

            for (int j = i+1;j<newtext.length();j++){
                if (tab[i]==tab[j]){
                    duplicate++;
                    lista1.add(tab[i]);
                }
            }
        }

        int amount = lista1.size();
    //    System.out.println(amount);
        return amount;
    }
}
