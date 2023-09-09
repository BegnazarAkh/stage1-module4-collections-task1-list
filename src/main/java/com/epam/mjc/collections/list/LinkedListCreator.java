package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> oddList = new LinkedList<>();
        for(int i = 0; i < sourceList.size(); i++){
            int currentInt = sourceList.get(i);
            if(currentInt % 2 == 0){
                oddList.addLast(currentInt);
            }else {
                oddList.addFirst(currentInt);
            }
        }
        return oddList;
    }

//    public static void main(String[] args) {
//        LinkedListCreator creator = new LinkedListCreator();
//        List<Integer> sourceList = List.of(1,2,3,4,5,6);
//        LinkedList<Integer> oddList = creator.createLinkedList(sourceList);
//
//        System.out.println(oddList);
//
//    }
}
