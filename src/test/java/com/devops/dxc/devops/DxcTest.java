package com.devops.dxc.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devops.dxc.devops.model.Dxc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class DxcTest {
   @Test
   void testAhorro() throws Exception {
         Dxc di = new Dxc(4350000,0);
         assertEquals(4350000,di.getAhorro() );
   }
   
   @Test
   void testDiezxciento() throws Exception {
         Dxc di = new Dxc(23000000,900000);
         assertEquals(2300000,di.getDxc() );
   }
   
   @Test
   void testSaldo() throws Exception {
        Dxc di = new Dxc(100000000,0);
        assertEquals(95247733,di.getSaldo() );
   }
   
   @Test
   void testImpuesto()throws Exception   {
        Dxc di = new Dxc(1000,0);
        assertEquals(0,di.getImpuesto() );
   }


   @Test
   void testServicioUF()throws Exception   {
        Dxc di = new Dxc(1000,0);
        assertEquals(0,di.getImpuesto() );
   }
}
