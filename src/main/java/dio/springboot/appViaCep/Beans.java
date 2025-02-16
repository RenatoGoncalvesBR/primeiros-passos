package dio.springboot.appViaCep;

import org.springframework.context.annotation.Bean;
import com.google.gson.Gson;

@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
    
}
