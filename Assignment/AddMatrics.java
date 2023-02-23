class AddMatrics {
    public void add(){
       // int a [][]= new int  [2][2];
       // int b[] []=new  int [2] [2];
        int a [][]={{2,3},{3,4}};
        int b [][]={{1,2},{7,8}};
        int c [][]= new int [2][2];
        System.out.println("enter first data");
        for( int i=0;i<2;i++){ //rows
        for(int j=0;j<2;j++){ //columns
       c[i][j]=a[i][j]+b[i][j];
       System.out.print(c[i][j]+" ");
       //System.out.println(a[i]);
        }
System.out.println();
        }
   }
    public static void main(String args[]){
         AddMatrics ad = new AddMatrics();
         ad.add();
    }
}