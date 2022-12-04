import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
public class Main {

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(3);
        list.add(26);
        System.out.print(list);
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer val = iterator.next();
            if(val%2 ==0){
                iterator.remove();
            }
        }

        System.out.print(list);
    }
}
