package com.company;

import java.util.Comparator;

public class SortByIdnp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getIdnp().compareTo(o2.getIdnp());
    }
}
