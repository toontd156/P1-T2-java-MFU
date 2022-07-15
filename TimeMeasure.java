public class TimeMeasure{
    public static void main(String[] args){
        int n = 50000;
        int result = 0;

        long startTime = System.currentTimeMillis();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                result = i+j;
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }
}