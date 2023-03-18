package patika.dev;

public class B_Harfi {
    public static void main(String[] args) {

      //  Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
        String[][] letter = new String[7][4];
        System.out.println();
        for(int i = 0; i< letter.length ; i++){
            for (int j = 0 ; j< letter[i].length; j++){
                if (i==0 || i==3 || i==6){
                    letter[i][j] = " * " ;
                } else if (j==0 || j==3) {
                    letter[i][j] = " * ";

                }else {
                    letter [i][j] = "   ";
                }

            }
        }
        for (String[] row :  letter) {
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
