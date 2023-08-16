import java.util.*;
import java.io.*;

public class VocabList {
    public static String[] remove(String[] s)
	{
		for(int j=0;j<s.length;j++) {
			if(s[j].charAt(s[j].length()-1)=='.' || s[j].charAt(s[j].length()-1)==',') {
				String temp=s[j].substring(0,s[j].length()-1);
				s[j]=temp;
			}
		}
		return s;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // InformationRetrieval ir=new InformationRetrieval();
        FileInputStream f=new FileInputStream("doc1.txt");
        StringBuffer sb1= new StringBuffer("");
        int i=0;
        while((i=f.read()) != -1)
        {
            sb1.append((char)i);
        }
        String str1=sb1.toString();
        String[] arr1=str1.split(" ");
        String[] newarr1=remove(arr1);
        Set<String>s1=new LinkedHashSet<>();
        for(var x:newarr1)
        {
            s1.add(x);
        }
        System.out.println("\n"+"The contents of doc1 is:");
        for(var x:s1)
        {
            System.out.print(x+" ");
        }
        System.out.println("\n\n");
        f.close();
        FileInputStream g=new FileInputStream("doc2.txt");
        StringBuffer sb2= new StringBuffer("");
        int j=0;
        while((j=g.read()) != -1)
        {
            sb2.append((char)j);
        }
        String str2=sb2.toString();
        String[] arr2=str2.split(" ");
        String[] newarr2=remove(arr2);
        Set<String>s2=new LinkedHashSet<>();
        for(var x:newarr2)
        {
            s2.add(x);
        }
        System.out.println("The contents of doc2 is:");
        for(var x:s2)
        {
            System.out.print(x+" ");
        }
        System.out.println("\n\n");
        g.close();
        FileInputStream h=new FileInputStream("doc3.txt");
        StringBuffer sb3= new StringBuffer("");
        int k=0;
        while((k=h.read()) != -1)
        {
            sb3.append((char)k);
        }
        String str3=sb3.toString();
        String[] arr3=str3.split(" ");
        String[] newarr3=remove(arr3);
        Set<String>s3=new LinkedHashSet<>();
        for(var x:newarr3)
        {
            s3.add(x);
        }
        System.out.println("The contents of doc3 is:");
        for(var x:s3)
        {
            System.out.print(x+" ");
        }
        System.out.println("\n\n");
        h.close();
        
    }
}
