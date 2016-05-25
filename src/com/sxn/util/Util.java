package com.sxn.util;

public class Util {

    public static Object[] combine(Object[]... groups) {
    	int arraySize = 0;
    	for (Object[] group: groups) {
    		arraySize += group.length;
    	}
    	Object[] newGroup = new Object[arraySize];
    	int i = 0;
    	for (Object[] group: groups) {
    		for (Object material: group) {
    			newGroup[i++] = material;
    		}
    	}
    	return newGroup;
    }
    
}
