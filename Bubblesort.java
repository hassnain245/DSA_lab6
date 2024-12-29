/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;
public class Bubblesort {
public void BubbleSort(int arr[]){
    int count=0;
    for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-1; j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;  
          
        }
           count++;
      }        
    } 
     System.out.println(count);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
public void earlystop(int[] arr){
 //boolean flag;
 int count=0;
 int c=0;
 for(int i=0; i<arr.length-1; i++){
    // flag=false;
     for(int j=0; j<arr.length-i-1; j++){
      if(arr[j]>arr[j+1]){
         int temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;               
         //flag=true;
     }
      count++; 
    }
     c++;
    // if(flag==false){
      //   break;
        
     //}
     
 }System.out.println(c +" "+count);
  for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
public void sortWOrds(String[] words){
    for(int i=0; i<words.length-1; i++){
       for(int j=0; j<words.length-1; j++){
      if(words[j].length()>words[j+1].length()){
            String temp=words[j];
            words[j]=words[j+1];
            words[j+1]=temp;   
        }    
          
         }  
       }  
     for(int i=0; i<words.length; i++){
        System.out.print(words[i] + " ");
    }
    }    

    public static void main(String[] args) {
     int[] arr={5,1,3,4,6,2};
     String[] input={"apple", "pie", "banana", "cat","a"};
     int[] num={1,2,3,5,4};
     Bubblesort b1=new Bubblesort();
    b1.BubbleSort(arr);
    // b1.sortWOrds(input);
     b1.earlystop(arr);
    }
    
}
