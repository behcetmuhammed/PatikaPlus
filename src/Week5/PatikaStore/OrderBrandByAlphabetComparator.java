package Week5.PatikaStore;

import java.util.Comparator;

public class OrderBrandByAlphabetComparator implements Comparator<Brand> {

    @Override
    public int compare(Brand o1, Brand o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
