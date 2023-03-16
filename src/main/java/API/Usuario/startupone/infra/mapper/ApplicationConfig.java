package API.Usuario.startupone.infra.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper novoModelMapper(){
        return new ModelMapper();
    }
}
