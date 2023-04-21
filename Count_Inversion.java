import java.util.*;
class Count_Inversion{
    public static int merge(int a[],int si,int mid,int ei){
        int b[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        int count=0;
        while(idx1<=mid&&idx2<=ei){
            if(a[idx1]<=a[idx2]){
                b[x++]=a[idx1++];
            }else{
                b[x++]=a[idx2++];
                count +=mid-idx1+1;
            }
        }
        while(idx1<=mid){
            b[x++]=a[idx1++];
        }
        while(idx2<=ei){
            b[x++]=a[idx2++];
        }
        for(idx1=si;idx1<=ei;idx1++){
            a[idx1]=b[idx1-si];
        }
        return count;
    }
    public static int divide(int a[],int si,int ei){
        int count=0;
        if(si<ei){
            int mid=(si+ei)/2;
            count += divide(a, si, mid);
            count += divide(a, mid+1, ei);
            count += merge(a, si, mid, ei);
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        System.out.println("Enter the array : ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int n=a.length;
        int count=divide(a, 0, n-1);
        System.out.println("Count Inversion is " + count);
    }
}  