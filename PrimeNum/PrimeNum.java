public class PrimeNum {
    public static void main(String args[]) {

        for (int i = 1; i <= 100; i++) {
            int div_by_num = 0;
            
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    div_by_num++;
                }
            }

            if (div_by_num == 2) {
                System.out.println(i);
            }
        }
    }
}