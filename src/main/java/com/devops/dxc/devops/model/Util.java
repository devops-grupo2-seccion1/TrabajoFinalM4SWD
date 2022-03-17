package com.devops.dxc.devops.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class Util {

    /**
     * Método para cacular el 10% del ahorro en la AFP. Las reglas de negocio se
     * pueden conocer en
     * https://www.previsionsocial.gob.cl/sps/preguntas-frecuentes-nuevo-retiro-seguro-10/
     *
     * @param ahorro
     * @param sueldo
     * @return
     *
     * public static int getDxc(int ahorro, int sueldo) { if (((ahorro * 0.1) /
     * getUf()) > 150) { return (int) (150 * getUf()); } else if ((ahorro * 0.1) <= 1000000 && ahorro
     * >= 1000000) { return (int) 1000000; } else if (ahorro <= 1000000) {
     * return (int) ahorro; } else { return (int) (ahorro * 0.1); } }
     */
    
    public static int getDxc(int ahorro, double uf) {
        if (((ahorro * 0.1) / uf) > 150) {
            return (int) (150 * uf);
        } else if ((ahorro * 0.1) <= 1000000 && ahorro >= 1000000) {
            return (int) 1000000;
        } else if (ahorro <= 1000000) {
            return (int) ahorro;
        } else {
            return (int) (ahorro * 0.1);
        }
    }

    public static int getImpuesto(int dxc) {
        //de momento siempre será 0.1 en etapa posterior se validara el porcentaje que aplica
        if (dxc > 0) {
            return (int) (dxc * 0.1);
        } else {
            return (int) (0);
        }
    }

    /**
     * Método que retorna el valor de la UF. Este método debe ser refactorizado
     * por una integración a un servicio que retorne la UF en tiempo real. Por
     * ejemplo mindicador.cl
     *
     * @return
     */
    public static double getUf() {
        // consumir la api de Por ejemplo mindicador.cl
        String today = getToday();
        System.out.println("getUf Date:" + today);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("https://mindicador.cl/api/uf/{today}", String.class, today);

        JSONObject jsonResponse = new JSONObject(result);
        JSONArray jsonArray = new JSONArray(jsonResponse.get("serie").toString());
        JSONObject jsonToday = new JSONObject(jsonArray.get(0).toString());
        System.out.println("Valor UF:" + jsonToday.get("valor"));

        return Double.parseDouble(jsonToday.get("valor").toString());
    }

    public static String getToday() {
        java.util.Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String format = formatter.format(date);
        return format;
    }

}
