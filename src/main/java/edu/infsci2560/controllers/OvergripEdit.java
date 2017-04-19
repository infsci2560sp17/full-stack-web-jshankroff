package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisOvergrips;
import edu.infsci2560.repositories.OvergripRepository;
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
public class OvergripEdit {
    @Autowired
    private OvergripRepository overgripRepository;

    
    @RequestMapping(value = "overgrips/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {    
        ModelAndView mv = new ModelAndView("overgripedit");
        TennisOvergrips tennisovergrips = overgripRepository.findOne(id);
        mv.addObject("overgrip", tennisovergrips);
//        mv.addObject("ratings", ratingRepository.findAll());

        return mv;
    }
    
    @RequestMapping(value = "overgrips/edit/{id}", 
            method = RequestMethod.PUT, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public String update( @Valid TennisOvergrips tennisovergrips, BindingResult result) {
        overgripRepository.save(tennisovergrips);
        return "redirect:/overgrips";
    }        
}
