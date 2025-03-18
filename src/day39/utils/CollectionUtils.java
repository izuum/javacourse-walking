package day39.utils;

import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils {
    public static <E> void dropEvenHashCodeElements(Collection collection){
        Iterator<E> iterator = collection.iterator();

        while(iterator.hasNext()){
            E e = iterator.next();

            if(e.hashCode() % 2 == 0){
                collection.remove(e);
            }
        }
    }
}
