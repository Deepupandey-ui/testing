public class Array2_D {
    public static void main(String[] args) {
        // int[][] a;
        //  a = new int[3][2];
        //int[][] a= new int[3][2];//declare and creation
        int[][] a= {{10,20,30},{40,50}};//declare and creation and initialization
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                 System.out.print(a[i][j] + " ");
            }
            System.out.println();
         }
    }
    
}
