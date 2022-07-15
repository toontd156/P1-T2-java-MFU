package labgruop;
import java.util.Scanner;
public class aj_god {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};

        Scanner a = new Scanner(System.in);
        System.out.print("Input your number do you want to find: ");
        int v = a.nextInt();
        System.out.println(a1(data, v, 0, len(data)-1));

        public void a1(int[] data, int v, int low, int high) {
            if(low > high){
                return false;
            }else{
                int mid = (low + high) / 2;
                if (v == data[mid]){
                    return true;
                }else if (v < data[mid]){
                    return a1(data, v, low, mid - 1);
                }else{
                    return a1(data, v, mid + 1, high);
                }
            }
        }
    }
}
