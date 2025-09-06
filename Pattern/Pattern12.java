public class Pattern12 {
    public static void main(String[] args) {
        int n=7;
        int nsp=1;
        int nst =n/2;

        for(int i=1; i<=n; i++){
           for(int j=1; j<=nst; j++){
            System.out.print("*");

           }
            for(int k=1;k<=i;k++){
           
                    System.out.print(" ");
                }
                if(i<=n/2){
                    nsp--;
                    nsp=nst+2;
                }
                else{
                    nsp++;
                    nst=nst-2;
                }
            System.out.println();
        }
    }
    
}
