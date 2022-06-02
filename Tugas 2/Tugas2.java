public class Tugas2 {
    public static void main(String[] args) {
        for (int N = 1; N <= 20; N++) {
            int p = 0;
            for(int x = 1; x <= N; x++) {
                if(N % x == 0)
                    p = p + 1;
            }
                if(p == 2)
                    System.out.println(N + " bilangan prima");
                else
                    System.out.println(N + " bukan bilangan prima");
        }
    }
}
