package Mycolloction;

import java.util.LinkedHashMap;

public class ArrayTOHashmap {
    public static void main(String[] args) {
        String s[]={"ijk","lmn","abc","xyz","abc"};
        LinkedHashMap<String,String>lhm=new LinkedHashMap<String,String>();
        for (String i:s)
        {
            lhm.put(i,"lV");

        }
        System.out.println(lhm);
    }
}
