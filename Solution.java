/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author manu
 */
public class Solution {

    public int solution(int[] A) {
        List<String> mylist = new ArrayList<>();
        for (int element : A) {
            mylist.add(Integer.toString(element));
        }
        int index = 0;
        if (mylist.size() % 2 == 0) {
            index = (mylist.size()) / 2;
        } else {
            index = (mylist.size() - 1) / 2;
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) < Integer.parseInt(o2)
                        ? -1 : Integer.parseInt(o1) > Integer.parseInt(o2)
                        ? 1 : 0;
            }
        };

        Collections.sort(mylist, comparator);
        return Integer.parseInt(mylist.get(index));
    }
}
