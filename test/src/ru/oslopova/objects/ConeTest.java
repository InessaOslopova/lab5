package ru.oslopova.objects;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class ConeTest {
        @Test
         public void testType(){
                        System.out.println("��������� ����� �����");
                        Cone t = new Cone(1,1,1,"Cone");
                        assertEquals("Cone",t.name);
                }   
                
        @Test
         public void testMethod(){
                        System.out.println("��������� ����� volume()");
                        Cone t = new Cone(2,6,2,"Cone");
                        assertEquals(25.12,t.volume(),0.01);                        
                }


    
}
