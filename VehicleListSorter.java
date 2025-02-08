import java.util.Comparator;
import java.util.LinkedList;

public class VehicleListSorter{
    public static <T> void sort(LinkedList<T> list, Comparator<T> comparator){
        int amount = list.size();
        for(int i = 0; i < amount - 1; i++){
            int min = i;
            for(int j = i + 1; j < amount; j++){
                if(comparator.compare(list.get(j), list.get(min)) < 0){
                    min = j;
                }
            }
            T t = list.get(min);
            list.set(min, list.get(i));
            list.set(i, t);
        }
    }
}