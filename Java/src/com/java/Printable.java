//Example for interface
package com.java;

public interface Printable 
{
    void print();
}
class Printer implements Printable 
{
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    public static void main(String[] args) {
        Printable printable = new Printer();
        printable.print();
    }
}