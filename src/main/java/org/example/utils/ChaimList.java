package org.example.utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lide
 */
public class ChaimList<E> extends ArrayList<E> {
    public ChaimList(E... e) {
        add(e);
    }

    public final ChaimList<E> add(E... e) {
        super.addAll(Arrays.asList(e));
        return this;
    }
}
