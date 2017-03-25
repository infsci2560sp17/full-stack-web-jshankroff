/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisBalls;
import edu.infsci2560.repositories.BallRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jshankroff
 */
@Controller
public class BallController {
    @Autowired
    private BallRepository repository;
    
    @RequestMapping(value = "balls", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("balls", "balls", repository.findAll());
    }
    
    @RequestMapping(value = "balls/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid TennisBalls tennisballs, BindingResult result) {
        repository.save(tennisballs);
        return new ModelAndView("balls", "balls", repository.findAll());
    }
    
}