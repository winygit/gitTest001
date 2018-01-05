/**
 * 
 */
package com.hna.gittest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class APP2 {

    /**
     * @param args
     * @return void
     */
    public static void main(String[] args) {

        java.text.DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(new Date()));
    }

}
