class Selection{
    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    void sort(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i])
                    swap(a,i,j);
            }   
        }
    }
    void print_arr(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.printf(" %d ",a[i]);
    }
}
class SelectionSort{
    public static void main(){
        int[] a={14,13,12,11,10};
        Selection s=new Selection();
        s.sort(a,5);
        s.print_arr(a,5);
    }
}