package com.devops.dxc.devops;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.devops.dxc.devops.model.Util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilTest {
    @Test
   void testValorServicioUF() throws Exception {
         Util di = new Util();
         //prueba para confirmar que se llega al servicio retornando un valor mayor a cero
         assertTrue(0<di.getUf());
   }
}
