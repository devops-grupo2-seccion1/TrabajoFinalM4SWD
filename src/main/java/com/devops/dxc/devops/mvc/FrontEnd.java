/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devops.dxc.devops.mvc;

import com.devops.dxc.devops.model.Dxc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jgajardog
 */
@Controller
@RequestMapping("/frontend")
public class FrontEnd {

    @GetMapping("/form")
    public String getFormulario(@ModelAttribute Dxc dxc) {
        return "formulario";
    }

    @PostMapping("/form")
    public String setResultado(@ModelAttribute Dxc dxc) {
        return "result";
    }

}
