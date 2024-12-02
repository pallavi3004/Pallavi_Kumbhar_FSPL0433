package com.sampleProject.EmployeeManagementSystem;

import java.util.*;

public class MapEx2 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(101,"Pallu");
        h.put(102,"Abhi");
        h.put(103,"Sakshi");
        h.put(104,"Anvi");
        h.put(105,"Sai");
        h.put(106,"Aparna");
        h.put(107,"Shobha");
        h.put(108,"Sanjeev");
        h.put(109,"Vasudha");
        h.put(110,"Ram");

        System.out.println(h);

        Set s = h.keySet();
        System.out.println("KeySet= "+s);

        System.out.println("EntrySet= "+h.entrySet());
        System.out.println("Contains= "+h.containsKey(102));

        Set s1 = h.entrySet();
        System.out.println("isEmpty= "+s1.isEmpty());

        Collection c= h.values();
        System.out.println("Collection values= "+c);

        Iterator itr=s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1= (Map.Entry)itr.next();
            if(m1.getKey().equals(102)){
                m1.setValue("Anushka");
            }
        }
        System.out.println(h);

    }
}
