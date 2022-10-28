public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{9, 10, 0 ,2, 87, 1000};

        // バブルソートを実行
        sort(A);

        // ソートできたかを確認
        confirmation(A);
    }

    public static void sort(int[] A) {
        for(int i = 0 ; i <= A.length - 2 ; i++){
            for(int j = A.length - 1 ; j >= i + 1 ; j--){
                if(A[j] < A[j - 1]) {
                    // 引数で受け取った配列Aの、j番目とj-1番目の値を入れ替えて戻す
                    replacement(A, j);
                }
            }
        }
    }


    /*
    引数で受け取った配列Aの、j番目とj-1番目の値を入れ替えて戻す
     */
    public static void replacement(int[] A, int j){
        int w = A[j];
        A[j] = A[j - 1];
        A[j - 1] = w;
    }

    /*
    ソートできたかを確認
     */
    public static void confirmation(int[] A) {
        for(int i = 0 ; i <= A.length - 1; i++){
            System.out.println(A[i]);
        }
    }
}