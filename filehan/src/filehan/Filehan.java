

package filehan;
import java.util.*;
import java.io.*;
public class Filehan {

   
    public static void main(String[] args) 
    {
     try{
         Scanner op=new Scanner(System.in);
         System.out.println("Choose the operation to be done:");
         System.out.println("1.Create");
         System.out.println("2.Write");
         System.out.println("3.Read");
         System.out.println("4.Delete");
         System.out.println("5.Rename");
         System.out.println("--------------------------------");
         
       String st;  
         do{
             System.out.println(" Choose: ");
             int opr=op.nextInt();
             switch(opr)
                 {
                     case 1:
                     {
                         System.out.println("Creation: ");                     
                         String a;
                         System.out.println("Enter the file name");
                         a=op.next();
                         File f1=new File("D:/"+a+".txt");
                         if(f1.createNewFile()) 
                        {
                        System.out.println("File created with the name : "+f1.getName());
                        }
                        break;
                     }
                     case 2:
                     { 
                            System.out.println("Writing...: ");
                    
                         String a;
                            System.out.println("Enter the file name");
                            a=op.next();
                         FileOutputStream f2=new FileOutputStream("D:/"+a+".txt");
                         System.out.println("Enter the data to be fetched: ");
                         String gh=op.next();
                         byte[]by=gh.getBytes();
                            f2.write(by);
                         break;
                     }
                     case 3:
                     {
                         System.out.println("Reading...: ");
                     
                          String a;
                     System.out.println("Enter the file name");
                     a=op.next();
                         FileInputStream f3=new FileInputStream("D:/"+a+".txt");
                         int df;
                         while((df=f3.read())>=0)
                         {
                             System.out.print((char)df);
                         }
                         break;
                     }
                     case 4:
                     {
                         System.out.println("Deleting...: ");
                     
                          String a;
                     System.out.println("Enter the file name");
                     a=op.next();
                         File f4=new File("D:/"+a+".txt");
                         f4.delete();
                     }
                     case 5:
                     {
                         System.out.println("Renaming...: ");
                     
                          String a;
                     System.out.println("Enter the file name");
                     a=op.next();
                         System.out.println("Enter the New file Name:");
                         String b=op.next();
                         File f5=new File("D:/"+a+".txt");
                         File f6=new File("D:/"+b+".txt");
                         f5.renameTo(f6);
                     }
                 }
        System.out.println("Do you wish to continue?");
        st=op.next();
              }
         while(st.equals("y"));
     }
     catch(Exception ee)
     {
         System.out.println(ee);
     }
    }
    
}
