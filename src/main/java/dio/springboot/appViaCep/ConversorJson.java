package dio.springboot.appViaCep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component // Anotação para que o Spring gerencie esta classe como um bean
public class ConversorJson {
    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json){
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
