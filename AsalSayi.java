public class AsalSayi {
    public static void main(String[] args) {

        int control;

       for (int i=2; i<=100; i++){
           control=0;
            for (int j=2; j<i; j++){
                if(i%j==0){
                    control=1;
                    break;
                }
            }
            if (control==0){
                System.out.print(i + " ");
            }
        }

    }
}
/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */
