package lab9;

public class TestArray {
    
    public void test(){
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++){
            a[i] = i;
        }
        for (int x:a) {
            System.out.println(x+ " ");
        }
    }
}
