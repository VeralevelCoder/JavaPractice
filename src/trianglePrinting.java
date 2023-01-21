public class trianglePrinting {

    public static void main(String[] args){
       printTriangle(3);
    }
    public static boolean printTriangle(int a){
        for(int i = 1;i<=a;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j*i);
                System.out.print('\t');
            }System.out.println();
        }
        return true;
    }
}
