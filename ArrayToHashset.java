package Mycolloction;

import java.util.LinkedHashSet;

public class ArrayToHashset {
    public static void main(String[] args) {
        //one entity to one entity
        String s[]={"ijk","lmn","abc","xyz","abc"};
        LinkedHashSet<String >lhs=new LinkedHashSet<String >();
        for (String i:s)
        {
            lhs.add(i);

        }
        System.out.println(lhs);
        //linked hash set removed duplicate in last not first
    }
}
