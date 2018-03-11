package compi.springbootjokesapp.controllers;

import compi.springbootjokesapp.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {

    private QuotesService quotesService;

    @Autowired
    public QuoteController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        model.addAttribute("quote", quotesService.getQuote());

        return "chucknorris";
    }

}
