// *                *
//  *              *
//   *            *
//    *          *
//     *        *
//      *      *
//       *    *
//        *  *
//         **
public class PatternV {
    public static void main(String args[]) {
        int n = 9;
        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                // if((i-j == 0 && i <= (n-1)/2) || (j+i == ((n-1)+(n-1)/2) && j> (n-1)/2))
                if(i==j)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            for(int j = 0 ; j < n ; j++){
                // if((i-j == 0 && i <= (n-1)/2) || (j+i == ((n-1)+(n-1)/2) && j> (n-1)/2))
                if(i+j==(n-1)  )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
