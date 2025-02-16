package dio.springboot.appMensagem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.google.gson.Gson;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();  
            sistema.enviarConfirmacaoCadastro();       
        };
    }
}