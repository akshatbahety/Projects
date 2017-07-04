package practice;

import java.util.*;

public class RobbersLanguage
{

  public static boolean check(char a, char[] array)
  {
    for(char aks : array)
    {
      if(aks == a ) 
      {
        return true;
      }
      
    }
    return false;
  }

  public static void main(String [] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter something to translate: ");
    String input = sc.nextLine();
    System.out.println("Please select a choice");
    System.out.println("1.Translate to Robbers Language");
    System.out.println("2.Translate from Robbers Language");
    int op = sc.nextInt();
    
    
    char[] array = input.toCharArray();
    char[] narray = {'a','e','i','o','u','A','E','I','O','U'};
    char[] aarray = {'a','e','i','u','A','E','I','U'};
    boolean test = false;
    
    
  if(op ==1)  
  {  
    for(int i = 0;i < array.length; i++)
    {
      
      test = check(array[i],narray);
      if(test)
      {
        System.out.print(array[i]);
      }
      if(test == false)
      {
        System.out.print(array[i] + "o"+array[i]);
      }
      
      
    } 
  }
    
    
  if(op == 2)
  {
    for(int j = 0; j < array.length;j++)
    {
      
      if(array[j] == 'o')
      {
  
        if(check(array[j-1],narray) == false && check(array[j+1],narray) == false 
        && array[j-1] == array[j+1])
        {
          System.out.print(array[j-1]);
        }
        else
        {
          System.out.print(array[j]);
        }
        
     }
    else if(check(array[j],aarray))
    {
      System.out.print(array[j]);
    }
     
    else if(array[j] == ' ')
    {
      System.out.print(" ");
    } 
    else if(check(array[j],aarray) == false)
    {
      if(array[j-1] != array[j+1])
      {
        System.out.print(array[j]);
      }
    }
    
      
  }

  }

  
  }

}