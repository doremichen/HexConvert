/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: HexConvert.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/1/18
 */

package com.adam.app;

/**
 * <h1>HexConvert</h1>
 * 
 * @autor AdamChen
 * @since 2018/1/18
 */
public final class HexConvert {

    private static final int BASE = 16;

    /**
     * 
     * <h1>IntToHex</h1> The method convert the integer to the hex number
     * 
     * @param i
     * @return hex number
     * @return int
     * 
     */
    public static int IntToHex(int i) {
        return Integer.parseInt(Integer.toHexString(i));
    }

    /**
     * 
     * <h1>HexToInt</h1> The method convert the hex to the integer number
     *
     * @param hex
     * @return integer number
     * @return int
     *
     */
    public static int HexToInt(int hex) {
        int ret = 0;
        int i = 0;

        while (hex > 0) {
            ret += (hex % 10) * Math.pow(BASE, i);
            hex /= 10;
            i++;
        }

        return ret;
    }

}
