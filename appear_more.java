import java.util.*;
class appear_more{
    public static void apper(int a[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k :");
        int k=sc.nextInt();
        int x=n/k;
        HashMap<Integer,Integer> y=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!y.containsKey(a[i])){
            y.put(a[i],1);
            }else{
                int count=y.get(a[i]);
                y.put(a[i],count+1);
            }
        }
        for(Map.Entry m:y.entrySet()){
            Integer temp=(Integer)m.getValue();
            if(temp>x)
            System.out.println(m.getKey());
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int n=a.length;
        apper(a, n);
    }
}