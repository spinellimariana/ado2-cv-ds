/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dw.ado2cv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author maris
 */
@Controller
public class CVController {

    //usar o modelo de query string abaixo para gerar dados difentes. Os dados estão gerados no método abaixo
    //cv?nome=MARIANA SPINELLI&dataNascimento=1987-11-09&telefone=(11) 93277-0911&email=marispinelli@gmail.com
    
    @GetMapping("/cv")
    public ModelAndView curriculum(@RequestParam String nome,
            @RequestParam String dataNascimento,
            @RequestParam String telefone,
            @RequestParam String email) {

        DadosPessoais dados = new DadosPessoais(nome, dataNascimento, telefone, email);
        ModelAndView mv = new ModelAndView("cv");
        mv.addObject("dadosPessoais", dados);
        return mv;

    }

}
