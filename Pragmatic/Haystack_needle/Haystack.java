/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haystack;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Klajdi
 */
public class Haystack {
    public static void main(String[] args) {
        StringBuilder haystack=new StringBuilder();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Haystack");
haystack.append(input.nextLine());
 StringBuilder needle=new StringBuilder();
        System.out.println("Enter Needle");
needle.append(input.nextLine());
        int k=0;
        System.out.println("Enter threshold");
        int threshold=input.nextInt();
        String [] str1=new String[100000];
       // String haystack="vnk2435kvabco8awkh125kjneytbcd12qjhb4acd123xmnbqwnw4t";
for (int i = threshold; i <= needle.length(); i++)
{
    for (int j = 0; j < needle.length(); j++)
    {
        if ((j+i) > needle.length())
        {
            break;
        }
      
          str1 [k]=needle.substring(j, j+i);
          k++;
    }
}
    String []str2=new String[1000];
    int l=0;
     for (int j = 0; j < k; j++)
    {
        if(haystack.indexOf(str1[j])!=-1){
        
         str2[l]=str1[j];
         l++;
        }
    }
     
    for(int i=0;i<l;i++){
      for(int j=1;j<l;j++){
          if(str2[i].contains(str2[j])&&str2[i].length()!=str2[j].length()){
              str2[j]="";
          }
      }
    }
    str2 = Arrays.stream(str2)//Removing blank spaces from Array
                     .filter(s -> (s != null && s.length() > 0))
                     .toArray(String[]::new); 
    int fin=str2.length;
    for(int j=0;j<fin;j++){
         System.out.println("String "+str2[j]+" found at haystack offset "+haystack.indexOf(str2[j])+" needle offset "+needle.indexOf(str2[j]));  
    }
    
}
}
