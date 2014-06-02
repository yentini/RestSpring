    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yentini.servicios.otrapruebarest.controllers;

import com.yentini.servicios.otrapruebarest.entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ccabrerizo
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rrhh")
public class RestController {

    @RequestMapping(value = "/person/", method = RequestMethod.GET)
    @ResponseBody
    public Person getPerson() {
        return new Person("Respuesta en formato dependiente del header de la petición");
    }

}
