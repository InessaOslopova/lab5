package ru.oslopova.objects;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class CuboidTest {
        @Test
         public void testType(){
                        System.out.println("��������� ����� ������������� ��������������");
                        Cuboid t = new Cuboid(1,1,1,1,"Cuboid");
                        assertEquals("Cuboid",t.name);
                }   
        @Test
         public void testMethod(){
                        System.out.println("��������� ����� sqare()");
                        Cuboid t = new Cuboid(3,4,6,5,"Cuboid");
                        assertEquals(148.0,t.square(),0.01);                        
                }



}