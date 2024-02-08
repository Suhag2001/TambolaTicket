package com.tambola.TambolaTicket.ticket_generator;

import java.util.List;

public class ElementChecker {
    static int getNumberOfElementsInSet(List<List<Integer>> set) {
        int count = 0;
        for (List<Integer> li : set)
            count += li.size();
        return count;
    }
}
