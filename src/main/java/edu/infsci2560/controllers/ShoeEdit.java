package edu.infsci2560.controllers;

import edu.infsci2560.models.TennisShoes;
import edu.infsci2560.repositories.ShoeRepository;
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
public class ShoeEdit {
    @Autowired
    private ShoeRepository shoeRepository;

    
    @RequestMapping(value = "shoes/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {    
        ModelAndView mv = new ModelAndView("shoeedit");
        TennisShoes tennisshoes = shoeRepository.findOne(id);
        mv.addObject("shoe", tennisshoes);
//        mv.addObject("ratings", ratingRepository.findAll());

        return mv;
    }
    
    @RequestMapping(value = "shoes/edit/{id}", 
            method = RequestMethod.PUT, 
            consumes="application/x-www-form-urlencoded", 
            produces = "application/json")
    public String update( @Valid TennisShoes tennisshoes, BindingResult result) {
        shoeRepository.save(tennisshoes);
        return "redirect:/shoes";
    }        
}
