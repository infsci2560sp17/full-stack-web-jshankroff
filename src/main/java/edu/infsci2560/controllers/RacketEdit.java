package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisRackets;
import edu.infsci2560.repositories.RacketRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author jshankroff
 */
@Controller
public class RacketEdit {
    @Autowired
    private RacketRepository racketRepository;

    
    @RequestMapping(value = "rackets/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {    
        ModelAndView mv = new ModelAndView("racketedit");
        TennisRackets tennisrackets = racketRepository.findOne(id);
        mv.addObject("racket", tennisrackets);
//        mv.addObject("ratings", ratingRepository.findAll());

        return mv;
    }
    
    @RequestMapping(value = "rackets/edit/{id}", 
            method = RequestMethod.PUT, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public String update( @Valid TennisRackets tennisrackets, BindingResult result) {
        racketRepository.save(tennisrackets);
        return "redirect:/rackets";
    }        
}
