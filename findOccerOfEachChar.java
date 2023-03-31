package Mycolloction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class findOccerOfEachChar {
    public static void main(String[] args) {
        String name ="gooogle";
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        //for (int i=name.length()-1;i>=0;i--)
        for (int i=0;i<name.length();i++)
        {
            if(hm.containsKey(name.charAt(i)))//(mab returns the last value (set returns the first value)
            {
                int counter=hm.get(name.charAt(i));
                hm.put(name.charAt(i),counter+1);
            }
            else
            {
             hm.put(name.charAt(i),1);
            }
        }
        System.out.println(hm);

    }
}
