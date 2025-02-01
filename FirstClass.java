public class FirstClass {
    public static void main(String[] args) {
        // int[] x={1,2,3,4,6,87,76};
        // for (int i=0;i<x.length;i++)
        // {
        //     System.out.print(x[i]+"  ");
        // }


        // int []x=new int[5];
        //  for(int i=0;i<x.length;i++){

        //     x[i]=i*10;
        //     System.out.print(i+" ");

        // }



        int[][] arr = new int[5][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=i*10+j;
            }

        }    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                System.out.println(arr[i][j]+" ");
            // System.out.println(x:"\n");
            
    }
}
}
