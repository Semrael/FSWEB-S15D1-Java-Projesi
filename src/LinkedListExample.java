import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        //array'i liste çevirdik
        String[] fruits= new String[]{"Orange","Banana","Apple"};
        List<String> fruitList= Arrays.asList(fruits);

        List<Integer> arrayList= new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();
        checkTiming(arrayList,"ARRAYLIST");
        checkTiming(linkedList,"LINKEDLIST");

    }

    public static void checkTiming(List<Integer> list,String type){
        for(int i=0 ;i<1E4;i++){
            list.add(i);
        }

        long start=System.currentTimeMillis();
        for(int i=0;i<1E4;i++){
            list.add(13,i*i);
        }
        long end=System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+ " ms for "+ type);
    }
}
