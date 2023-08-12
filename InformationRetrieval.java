import java.util.*;
import java.io.*;

public class InformationRetrieval {
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
    public static void main(String[] args) throws IOException
    {
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

        //creating a combined set
        Set<String> combinedSet=new LinkedHashSet<>();
        for(var x:s1)
        {
            combinedSet.add(x);
        }
        for(var x:s2)
        {
            combinedSet.add(x);
        }
        for(var x:s3)
        {
            combinedSet.add(x);
        }
        System.out.println("The individual tokens in the excluding the frequent tokens are :->");

        for(var it:combinedSet)
        {
            System.out.print(it+" ");
        }
        Map<String,Integer>mp=new LinkedHashMap<>();
        int n=0;
        for(var x:combinedSet)
        {
            mp.put(x,n);
            n=n+1;
        }
        System.out.println("\n");
        for(var x:mp.entrySet())
        {
            System.out.println(x.getKey()+" -> "+x.getValue());
        }

        //now we create a two dimensional incidence matrix
        int[][] mat=new int[combinedSet.size()][3];
        for(int row=0;row<combinedSet.size();row++)
        {
            for(int col=0;col<3;col++)
            {
                mat[row][col]=0;
            }
        }
        //display
        // for(int row=0;row<combinedSet.size();row++)
        // {
        //     for(int col=0;col<3;col++)
        //     {
        //         System.out.print(mat[row][col]+" ");
        //     }
        //     System.out.println("\n");
        // }
        for(var x:combinedSet)
        {
            if(s1.contains(x))
            {
                if(mp.containsKey(x))
                {
                    mat[mp.get(x)][0]=1;
                }
            }
            if(s2.contains(x))
            {
                mat[mp.get(x)][1]=1;
            }
            if(s3.contains(x))
            {
                mat[mp.get(x)][2]=1;
            }

        }
        System.out.println("\n"+"The term incidence matrix is:");
        for(int row=0;row<combinedSet.size();row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print(mat[row][col]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Enter the strings(in lowercase) you want to compare :");
        String string1=sc.nextLine();
        String string2=sc.nextLine();
        String string3=string1.toLowerCase();
        String string4=string2.toLowerCase();
        int r1=mp.get(string3);
        int r2=mp.get(string4);
        //we have to declare two ArrayList
        if(r1 <= combinedSet.size() && r2 <= combinedSet.size())
        {
            ArrayList<Integer>a1=new ArrayList<>();
            ArrayList<Integer>a2=new ArrayList<>();
            for(int col=0;col<3;col++)
            {
                a1.add(mat[r1][col]);
                a2.add(mat[r2][col]);
            }
            // System.out.println(a1.size());
            // System.out.println(a2.size());
            // for(int index=0;index<a1.size();index++)
            // {
            //     System.out.print(a1.get(index)+" ");
            // }
            // for(var x:a2)
            // {
            //     System.out.print(x+" ");
            // }
            System.out.println("Which operation you want to perform :");
            System.out.println("Enter 1->AND Operation 2->OR Operation 3->NOT Operation");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                ArrayList<Integer>res=new ArrayList<>();
                for(int loop=0;loop<a1.size();loop++)
                {
                    int n1=a1.get(loop);
                    int n2=a2.get(loop);
                    res.add(n1 & n2);
                }
                System.out.println("The final list obtained after doing AND Operation->");
                for(int ind=0;ind<res.size();ind++)
                {
                    System.out.print(res.get(ind)+" ");
                }
                System.out.println("\n");
                boolean flag=false;
                for(int l=0;l<res.size();l++)
                {
                    if(res.get(l)==1)
                    {
                        System.out.println("The two are present in document "+(l+1));
                        flag=true;
                    }
                }
                if(!flag)
                {
                    System.out.println("PRESENT IN NEITHER OF THE DOCUMENT");
                }
                System.exit(1);
            }
            else if(choice ==2)
            {
                ArrayList<Integer>res=new ArrayList<>();
                for(int loop=0;loop<a1.size();loop++)
                {
                    int n1=a1.get(loop);
                    int n2=a2.get(loop);
                    res.add(n1 | n2);
                }
                System.out.println("The final list obtained after doing OR Operation->");
                for(int ind=0;ind<res.size();ind++)
                {
                    System.out.print(res.get(ind)+" ");
                }
                System.out.println("\n");
                boolean flag=false;
                for(int l=0;l<res.size();l++)
                {
                    if(res.get(l)==1)
                    {
                        System.out.println("The two are present in document "+(l+1));
                        flag=true;
                    }
                }
                if(!flag)
                {
                    System.out.println("PRESENT IN NEITHER OF THE DOCUMENT");
                }
                System.exit(1);
            }
            else
            {
                System.out.println("In which row you want NOT Operation 1->row1 and 2->row2");
                int choice1=sc.nextInt();
                if(choice1 == 1)
                {
                    ArrayList<Integer>res=new ArrayList<>();
                    for(int loop=0;loop<a1.size();loop++)
                    {
                        int n1=a1.get(loop);
                        int n2=a2.get(loop);
                        n1=~n1;
                        res.add(n1 & n2);
                    }
                    System.out.println("The final list obtained after doing NOT Operation->");
                    for(int ind=0;ind<res.size();ind++)
                    {
                        System.out.print(res.get(ind)+" ");
                    }
                    System.out.println("\n");
                    boolean flag=false;
                    for(int l=0;l<res.size();l++)
                    {
                        if(res.get(l)==1)
                        {
                            System.out.println("The two are present in document "+(l+1));
                            flag=true;
                        }
                    }
                    if(!flag)
                    {
                        System.out.println("PRESENT IN NEITHER OF THE DOCUMENT");
                    }
                    System.exit(1);
                }
                else if(choice1 ==2)
                {
                    ArrayList<Integer>res=new ArrayList<>();
                    for(int loop=0;loop<a1.size();loop++)
                    {
                        int n1=a1.get(loop);
                        int n2=a2.get(loop);
                        n2=~n2;
                        res.add(n1 & n2);
                    }
                    System.out.println("The final list obtained after doing NOT Operation->");
                    for(int ind=0;ind<res.size();ind++)
                    {
                        System.out.print(res.get(ind)+" ");
                    }
                    System.out.println("\n");
                    boolean flag=false;
                    for(int l=0;l<res.size();l++)
                    {
                        if(res.get(l)==1)
                        {
                            System.out.println("The two are present in document "+(l+1));
                            flag=true;
                        }
                    }
                    if(!flag)
                    {
                        System.out.println("PRESENT IN NEITHER OF THE DOCUMENT");
                    }
                    System.exit(1);
                }
                else
                {
                    System.out.println("INVALID ROW NUMBER ,NOT IN THE RANGE");
                    System.exit(1);
                }

            }
        }
        else
        {
            System.out.println("INVALID ROW NUMBER ,NOT IN THE RANGE");
            System.exit(1);
        }
        sc.close();
    }
}
