package compi.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteService implements QuotesService {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getQuote() {
        return quotes.getRandomQuote();
    }

}
