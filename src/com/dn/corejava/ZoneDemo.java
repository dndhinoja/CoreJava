package com.dn.corejava;

import java.time.ZoneId;

public class ZoneDemo {

    public static void main(String[] args) {
        ZoneId z= ZoneId.systemDefault();
        System.out.println(z.getId());
    }
}
