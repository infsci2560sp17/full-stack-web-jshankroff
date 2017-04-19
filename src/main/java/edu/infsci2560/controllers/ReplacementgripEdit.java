package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisReplacementgrips;
import edu.infsci2560.repositories.ReplacementgripRepository;
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
public class ReplacementgripEdit {
    @Autowired
    private ReplacementgripRepository replacementgripRepository;

    
    @RequestMapping(value = "replacementgrips/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {    
        ModelAndView mv = new ModelAndView("replacementgripedit");
        TennisReplacementgrips tennisreplacementgrips = replacementgripRepository.findOne(id);
        mv.addObject("replacementgrip", tennisreplacementgrips);
//        mv.addObject("ratings", ratingRepository.findAll());

        return mv;
    }
    
    @RequestMapping(value = "replacementgrips/edit/{id}", 
            method = RequestMethod.PUT, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public String update( @Valid TennisReplacementgrips tennisreplacementgrips, BindingResult result) {
        replacementgripRepository.save(tennisreplacementgrips);
        return "redirect:/replacementgrips";
    }        
}
