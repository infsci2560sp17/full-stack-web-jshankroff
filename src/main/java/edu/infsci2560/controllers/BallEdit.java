package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisBalls;
import edu.infsci2560.repositories.BallRepository;
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
public class BallEdit {
    @Autowired
    private BallRepository ballRepository;

    
    @RequestMapping(value = "balls/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {    
        ModelAndView mv = new ModelAndView("ballEdit");
        TennisBalls tennisballs = ballRepository.findOne(id);
        mv.addObject("balls", tennisballs);
//        mv.addObject("ratings", ratingRepository.findAll());

        return mv;
    }
    
    @RequestMapping(value = "balls/edit/{id}", 
            method = RequestMethod.PUT, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public String update( @Valid TennisBalls tennisballs, BindingResult result) {
        ballRepository.save(tennisballs);
        return "redirect:/balls";
    }        
}
