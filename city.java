import java.util.*;
class city
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String[] city= new String[5];
        int[] code=new int[5];
       
        System.out.println("Enter the city and code");
        for(int i=0;i<5;i++)
        {
            city[i]=sc.next();
            code[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(city[i].compareTo(city[j])>0)
                {
                    String temp=city[i];
                    city[i]=city[j];
                    city[j]=temp;
                    int t=code[i];
                    code[i]=code[j];
                    code[j]=t;
                }
            }
        }
        System.out.println("City\tCode");
        for(int j=0;j<5;j++)
        {
            System.out.println(city[j]+"\t"+code[j]);
        }



    }
}