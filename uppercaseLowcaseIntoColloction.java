package Mycolloction;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class uppercaseLowcaseIntoColloction {
    public static void main(String[] args) {
        List l=new ArrayList<String >();


        try {
        FileReader fr=new FileReader("D:\\java program\\file.txt");
        int i;
        String s="";
        while((i=fr.read())!=-1)
        {
            s=s+(char)i;
        }
        System.out.println(s);
        String ss[]=s.split(" ");
        for (int j=0;j<ss.length;j++)
        {
            char c[]=ss[j].toCharArray();
            if(c[0]>=97 && c[0]<=122)
            {
                c[0]= (char) (c[0]-32);

            }
            if(c[c.length-1]>=65 && c[c.length-1]<=90)
            {
                c[c.length-1]=(char)(c[c.length]+32);
            }
            ss[j]=String.valueOf(c);
            l.add(ss[j]);

        }
        System.out.println(l);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
