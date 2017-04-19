package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisStrings;
import edu.infsci2560.repositories.StringRepository;
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
public class StringEdit {
    @Autowired
    private StringRepository stringRepository;

    
    @RequestMapping(value = "strings/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {    
        ModelAndView mv = new ModelAndView("stringedit");
        TennisStrings tennisstrings = stringRepository.findOne(id);
        mv.addObject("string", tennisstrings);
//        mv.addObject("ratings", ratingRepository.findAll());

        return mv;
    }
    
    @RequestMapping(value = "strings/edit/{id}", 
            method = RequestMethod.PUT, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public String update( @Valid TennisStrings tennisstrings, BindingResult result) {
        stringRepository.save(tennisstrings);
        return "redirect:/strings";
    }        
}
