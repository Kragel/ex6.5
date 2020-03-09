/*Create a class with public, private, protected, and package-access
fields and method members. Create an object of this class and see what kind of compiler
messages you get when you try to access all the class members. Be aware that classes in the
same directory are part of the “default” package. */
package com.company;

public class Main {

    public static void main(String[] args) {
        FourWays fw = new FourWays();
        fw.showa();
        fw.showb();
        fw.showc();
        fw.a = 10;
        fw.b = 20;
        fw.c = 30;
        fw.showa();
        fw.showb();
        fw.showc();
    }
}
