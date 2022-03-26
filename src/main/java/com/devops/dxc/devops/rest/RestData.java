package com.devops.dxc.devops.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.model.Util;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/msdxc")
public class RestData {

    private final static Logger LOGGER = Logger.getLogger("devops.subnivel.Control");

    @GetMapping(path = "/dxc", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Dxc getData(@RequestParam(name = "sueldo") String sueldo, @RequestParam(name = "ahorro") String ahorro) {

        LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado Diez por ciento>");

        Dxc response = new Dxc(Integer.parseInt(ahorro), Integer.parseInt(sueldo));
        response.calcular();
        return response;
    }

    @GetMapping(path = "/impuesto", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Integer getImpuesto(@RequestParam(name = "retiro") String retiro) {
        LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado impuesto>");
        Integer response = Util.getImpuesto(Integer.parseInt(retiro));
        return response;
    }


    @GetMapping(path = "/saldo", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Integer getSaldo(@RequestParam(name = "ahorro") String ahorro) {
        LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado saldo>");
        Double uf = Util.getUf();
        Integer response = Integer.parseInt(ahorro) - Util.getDxc(Integer.parseInt(ahorro), uf);
        return response;
    }

    @GetMapping(path = "/uf", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    double getDataUF() {
        LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultando uf>");
        Util u = new Util();
        return u.getUf();
    }
}
