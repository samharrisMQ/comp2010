package week3;

import org.junit.*;
import static org.junit.Assert.*;

/* A table to store values keyed to pairs of Strings */
public class Table {
    java.util.Map<String, java.util.Map<String, Integer>> data;
    
    public Table(){
        data = new java.util.HashMap<String, java.util.Map<String, Integer>>();
    }

    public void add(String k1, String k2, int value){
        if (data.containsKey(k1)){
            data.get(k1).put(k2, Integer.valueOf(value));
        } else {
            java.util.Map<String, Integer> fresh = new java.util.HashMap<String, Integer>();
            fresh.put(k2, Integer.valueOf(value));
            data.put(k1, fresh);
        }
    }

    public int get(String k1, String k2){
        if(data.containsKey(k1)){
            if (data.get(k1).containsKey(k2)){
                return data.get(k1).get(k2);
            }
        }
        return -1;
    }

    @Test
    public void testBasics(){
        Table t = new Table();
        t.add("hi", "there", 4);
        assertEquals(t.get("hi", "there"), 4);
        t.add("hi", "there", 5);
        assertEquals(t.get("hi", "there"), 5);
        assertEquals(t.get("hi", "mate"), -1);
        t.add("hi", "again",0);
        assertEquals(t.get("hi", "there"), 5);
        assertEquals(t.get("hi", "mate"), -1);
        assertEquals(t.get("hi", "again"),0);
    }


}
