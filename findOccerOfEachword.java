package Mycolloction;

import java.util.HashMap;

public class findOccerOfEachword {
    public static void main(String[] args) {
        String name ="india is my country is new ";
        String name1[]=name.split(" ");
        HashMap<String,Integer> hm=new HashMap<String ,Integer>();
        //for (int i=name.length()-1;i>=0;i--)
        for (int i=0;i<=name1.length-1;i++)
        {
            if(hm.containsKey(name1[i]))//(mab returns the last value (set returns the first value)
            {
                int counter=hm.get(name1[i]);
                hm.put(name1[i],counter+1);
            }
            else
            {
                hm.put(name1[i],1);
            }
        }
        System.out.println(hm);
    }
}
