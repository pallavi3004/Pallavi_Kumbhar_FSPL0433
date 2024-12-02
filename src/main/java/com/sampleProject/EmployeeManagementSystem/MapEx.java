package com.sampleProject.EmployeeManagementSystem;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        HashMap h = new HashMap<>();
        h.put(101,"Appu");
        h.put(102,"Sai");
        h.put(103,"Abhi");
        h.put(104,"Anvi");
        h.put(105,"Akshu");

        System.out.println(h);

        Set s = h.keySet();
        System.out.println(s);

        Collection c = h.values();
        System.out.println(c);

        Set s1 = h.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            if(m1.getKey().equals(104)){
                m1.setValue("Shobha");
            }
        }
        System.out.println(h);
    }
}
