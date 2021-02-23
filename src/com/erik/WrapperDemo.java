package com.erik;

public class WrapperDemo {

    public static void main(String[] args) {
        Double obj1= Double.valueOf(2.71);
        Double obj2= Double.valueOf("2.71");
        Integer obj3= Integer.valueOf(345);
        Integer obj4= Integer.valueOf("5");


        System.out.println("obj1 : "+obj1);
        System.out.println("obj2 : "+obj2);
        System.out.println(obj1+" = "+obj2+" ? - "+obj1.equals(obj2));
        System.out.println("Obj3 : "+obj3.intValue() );
        System.out.println("Obj4 : "+obj4.intValue() );
        System.out.println(Integer.max(3,7) );
        System.out.println(Integer.min(2,1));
        try{
            System.out.println("Parsed from String - "+Integer.parseInt("9"));
        }
        catch(NumberFormatException e){
            System.out.println("Exception : "+e);
        }
        System.out.println("Binary of "+obj4+" is "+Integer.toBinaryString(obj4));
        
    }
}
