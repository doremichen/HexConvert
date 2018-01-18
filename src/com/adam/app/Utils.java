/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app;

/**
 * <h1>Utils</h1>
 * 
 * @autor AdamChen
 * @since 2018/1/18
 */
public final class Utils {
    
    private static final boolean ISLOG = true;
    
    /**
     * 
     * <h1>print</h1>
     *
     * @param str
     * @return void
     *
     */
    public static void print(String str) {
        if (ISLOG) {
            System.out.println(str);
        }
    }
    
    /**
     * 
     * <h1>print</h1>
     *
     * @param obj
     * @param str
     * @return void
     *
     */
    public static void print(Object obj, String str) {
        if (ISLOG) {
            System.out.println(obj.getClass().getSimpleName() + " " + str);
        }
    }

}
