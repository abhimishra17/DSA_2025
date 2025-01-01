import java.util.ArrayList;
import java.util.Scanner;

//Here we have to find the peak element int the array and display 
public class peak {
  public static ArrayList<Integer> fun(int []arr,int n){
    ArrayList<Integer>ans=new ArrayList<>();
    ans.add(arr[n-1]);
    int currmaxi=arr[n-1];
    for(int i=n-2;i>=0;i--){
      if(currmaxi<arr[i]){
        ans.add(arr[i]);
        currmaxi=arr[i];
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter "+i+"th element of the array");
      arr[i]=sc.nextInt();
    }
    sc.close();
     System.out.println("So the peak elements of the arrays are ");
     ArrayList<Integer>list=fun(arr,n);
     for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
     }
    
  }
  
}
