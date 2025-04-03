package com;
import java.util.*;
public class ListManager {
    public static void addElement(List<Integer> list, int x){
        list.add(x);
    }
    public static void removeElement(List<Integer> list, int x){
        list.remove(Integer.valueOf(x));
    }
    public static int checkSize(List<Integer> list){
        return list.size();
    }
}
