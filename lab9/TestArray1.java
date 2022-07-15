package lab9;

public class TestArray1 {
    
    public void test(){
        String[] name = {"John", "Tom"};
        printArray(name);
        changName(name);
        printArray(name);
    }

    public void printArray(String[] name){
        for(int i = 0; i < name.length; i++){
            System.out.print(name[i]+ " ");
            System.out.println();
        }
    }

    public void changName(String[] name){
        name[0] = "Gorge";
    }
}
