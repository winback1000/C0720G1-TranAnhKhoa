package _12_java_collection_framework.hashMap_n_hashSet;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
