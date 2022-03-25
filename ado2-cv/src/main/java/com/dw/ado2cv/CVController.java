/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dw.ado2cv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author maris
 */
@Controller
public class CVController {

    @GetMapping("/cv") // mostrar o cv estaticamente
    public String estatico() {
        return "cv"; 
    }

}
