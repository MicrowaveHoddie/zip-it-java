package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zip {
    public static <T> List<T> merge(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();

        int i = 0;
        int size1 = list1.size();
        int size2 = list2.size();

        while (i < size1 && i < size2) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }

        while (i < size1) {
            result.add(list1.get(i));
            i++;
        }

        while (i < size2) {
            result.add(list2.get(i));
            i++;
        }

        return result;
    }
}
