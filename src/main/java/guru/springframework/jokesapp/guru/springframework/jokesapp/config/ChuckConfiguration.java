package guru.springframework.jokesapp.guru.springframework.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is a Spring Java configuration example
 * @author PALLAB
 */
@Configuration
public class ChuckConfiguration {


    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
