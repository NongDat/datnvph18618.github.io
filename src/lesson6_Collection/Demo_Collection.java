/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nongvandat
 */
public class Demo_Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet =new HashSet<>();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(2);
        myList.add(7);
        myList.add(8);
        
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        mySet.add(2);
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);
        
        
        
        
        System.out.println("myList :");
        System.out.println(myList);
        System.out.println("mySet :");
        System.out.println(mySet);
        
        System.out.println("_________________________");
        // myList.addAll(mySet); ~ myList += mySet
        //mySet.addAll(myList); ~ mySet += myList
        
        mySet.retainAll(myList);
        System.out.println(myList);
        System.out.println(mySet);
        
        Collections.shuffle(myList);
        System.out.println("Hoán vị ngẫu nhiên :"+myList);
        
//        Comparator c = new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                int i1 = Integer.parseInt(o1.toString()),
//                        i2=Integer.parseInt(o2.toString());
//                if(i1 == i2){
//                    return 0;
//                }else if(i1>i2){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//            
//        };
//        Collections.sort(myList, c);
//        
//        System.out.println("Sắp xếp :" + myList);
//        Collections.reverse(myList);
//        System.out.println("Đảo ngược :"+myList);
    
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = Integer.parseInt(o1.toString()),
                        i2=Integer.parseInt(o2.toString());
                if(i1==i2){
                    return 0;
                }else if(i1>i2){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(myList, c);
        
        System.out.println("Sắp xếp :" + myList);
    }
    
}
