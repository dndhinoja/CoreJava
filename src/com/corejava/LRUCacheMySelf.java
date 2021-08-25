package com.corejava;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheMySelf {
    int capacity;
    Map<Integer,Integer> linkedHashMap;
//    LinkedHashMap linkedHashMap;

    public LRUCacheMySelf(int capacity) {
        this.capacity = capacity;
        linkedHashMap = new LinkedHashMap<Integer,Integer>(capacity);
    }



    private void refer(int key, int value) {

        if (get(key,value) == false) {
            set(key, value);
        }
    }

    private void set(int key, int value) {
        if(linkedHashMap.size() == capacity){
            Map.Entry<Integer, Integer> first = linkedHashMap.entrySet().iterator().next();
            linkedHashMap.remove(first.getKey());
        }
        linkedHashMap.put(key,value);
    }

    private boolean get(int key,int value) {
        if(!linkedHashMap.containsKey(key) ) {
            return false;
        }
        linkedHashMap.remove(key);
        //int value = linkedHashMap.get(key);
        linkedHashMap.put(key,value);
        return true;
    }

    private int get(int key){
        int value = 0;
        if(!linkedHashMap.containsKey(key)){
           return 0;
        }
       // int value = linkedHashMap.get(key);
        Iterator<Map.Entry<Integer,Integer>> itr = linkedHashMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, Integer> entry = itr.next();
            if(entry.getKey()==key){
                value = entry.getValue();
                break;
            }
        }
        return value;
    }

    //LinkedHashMap
    public static void main(String[] args){
        LRUCacheMySelf lruCacheMySelf = new LRUCacheMySelf(3);
        lruCacheMySelf.refer(1,2);
        lruCacheMySelf.refer(2,3);
        lruCacheMySelf.refer(1,5);
        lruCacheMySelf.refer(4,5);
        lruCacheMySelf.refer(6,7);

        System.out.println(lruCacheMySelf.get(4));

    }
}
