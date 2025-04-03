package com;

import com.ListManager;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListTester {
    @Test
    public void add(){
        List<Integer> list=new ArrayList<>();
        ListManager.addElement(list,10);
        assertTrue(list.contains(10));
    }

    @Test
    public void remove(){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        ListManager.removeElement(list,10);
        assertFalse(list.contains(10));
    }

    @Test
    public void size(){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        assertEquals(2,ListManager.checkSize(list));
    }
}
