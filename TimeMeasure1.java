
public class TimeMeasure1{
    public static void main(String[] args){
        int n = 1400;
        int result = 0;

        long startTime = System.currentTimeMillis();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                for(int k=1;k<=n;k++) {
                    result = i+j+k;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }
}