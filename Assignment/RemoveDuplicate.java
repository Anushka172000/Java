class RemoveDuplicate{
    public static void showArray(){
        int a[]={1,2,56,56,78,45,90,90};
        int temp []= new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){ // comparing 0,1 index forward
                temp[j]=a[i];
                j++;

                
            }
        }

        temp [j]=a[a.length-1];
       
        for(int i=0;i<temp.length;i++){
      System.out.println(temp[i]);
        }
   
    } 
    public static void main(String args[]){
   showArray();
    }
}