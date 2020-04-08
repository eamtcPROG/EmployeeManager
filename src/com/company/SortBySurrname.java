package com.company;

import java.util.Comparator;

public class SortBySurrname implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getPrenume().compareTo(o2.getPrenume());
    }
}
