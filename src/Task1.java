import com.sun.source.tree.BreakTree;

import java.util.Set;
import java.util.TreeSet;
//subset headset tailset methodlarin bilirem, sadece bilmedim ozumuz yazmaliyiq yoxsa methoddan istifade etmeliyik ona gore methodlari ozum yazdim
public class Task1{
    public static void main(String[] args) {
        Set<Integer> integerSet= new TreeSet<>();
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(15);
        integerSet.add(20);
        integerSet.add(25);
        integerSet.add(30);
        System.out.println("TreeSet:        "+integerSet);
        System.out.println("SubSet [10-25): "+subSet(integerSet));
        System.out.println("HeadSet <20:    "+headSet(integerSet));
        System.out.println("TailSet >=15:   "+tailSet(integerSet));

    }
    public static Set<Integer> subSet(Set<Integer> set){
        Set<Integer> subSet=new TreeSet<>();
        for(Integer i:set){
            if(i>=10&&i<25) {
                subSet.add(i);
            }
        }
        return subSet;
    }
    public static Set<Integer> headSet(Set<Integer> set){
        Set<Integer> headSet=new TreeSet<>();
        for(Integer i: set){
            if(i<20){
                headSet.add(i);
            }
        }
        return headSet;
    }
    public static Set<Integer> tailSet(Set<Integer> set){
        Set<Integer> tailSet=new TreeSet<>();
        for(Integer i: set){
            if(i>=15){
                tailSet.add(i);
            }
        }
        return tailSet;

    }
}
