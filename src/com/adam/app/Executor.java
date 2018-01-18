/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Executor.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app;

/**
 * <h1>Executor</h1>
 * 
 * @autor AdamChen
 * @since 2018/1/18
 */
public class Executor {

    /**
     * <h1>main</h1>
     *
     * @param args
     * @return void
     *
     */
    public static void main(String[] args) {
        
        int value = 1024;
        
        Utils.print("before int to hex: value = " + value);
        value = HexConvert.IntToHex(value);
        Utils.print("after int to hex: value = " + value);
        value = HexConvert.HexToInt(value);
        Utils.print("after hex to int: value = " + value);

    }

}
