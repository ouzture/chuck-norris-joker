package ouzture.springframework.chucknorrisjoker.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {



    @Override
    public String getRandomJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

        return chuckNorrisQuotes.getRandomQuote();
    }
}
