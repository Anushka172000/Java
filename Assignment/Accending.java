class sorting{
    public static void Dse(){
        int a[]={4,5,6,78,8};
        int temp =0;
        System.out.println("Elements of orginal array");
        for(int i=0;i<a.length;i++){
            
                System.out.println(a[i]+" ");
                
            }
               // sorting Decending order 
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++)
                if(a[i]<a[j]){
                     
                     
                        temp=a[i];
                        a[i]=a[j];
                        
                        a[j]=temp;
                    
                }
                     }
                     System.out.println();
                     System.out.println("Elements of array sorted in Dcending ");
                     for(int i=0;i<a.length;i++){
                        System.out.println(a[i]+"");
                     }
    }
    public static void main(String args[]){
Dse();
    }
}
