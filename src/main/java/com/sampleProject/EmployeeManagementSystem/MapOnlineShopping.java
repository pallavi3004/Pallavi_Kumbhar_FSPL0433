
/* we have a online shopping website
under that oorder id and order history
hashmap
addorder

remover
printorderhistory
orderid */

package com.sampleProject.EmployeeManagementSystem;

import java.util.*;
public class MapOnlineShopping {
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put(101,"Pencil");
        hm.put(102,"NoteBook");
        hm.put(103,"Rubber");
        hm.put(104,"Book");
        hm.put(105,"Whitener");
        hm.put(106,"Scale");
        hm.put(107,"Pen");
        hm.put(108,"Inkpen");
        hm.put(109,"Ballpen");
        hm.put(110,"Colorbox");

        System.out.println("Shopping order: "+hm);

        hm.remove(105);
        System.out.println("Remove order: ="+hm);

        Collection c = hm.values();
        System.out.println(c);

        Set s = hm.entrySet();
        System.out.println("s: "+s);

        System.out.println("OrderId: "+hm.keySet());

        Iterator itr = s.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            if(m1.getKey().equals(102)){
                m1.setValue("Shopner");
            }
        }
        System.out.println("Order History: "+hm);
    }
}
