package daniel.danielspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import daniel.danielspring.domain.Ingredient.Type;
import daniel.danielspring.repository.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import daniel.danielspring.domain.Ingredient;

@SpringBootApplication
public class DanielSpringApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DanielSpringApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }

    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                repo.save(new Ingredient.Builder("FLTO", "Flour Tortilla", Type.WRAP).build());
//                repo.save(new Ingredient.Builder("COTO", "Corn Tortilla", Type.WRAP).build());
//                repo.save(new Ingredient.Builder("GRBF", "Ground Beef", Type.PROTEIN).build());
//                repo.save(new Ingredient.Builder("CARN", "Carnitas", Type.PROTEIN).build());
//                repo.save(new Ingredient.Builder("TMTO", "Diced Tomatoes", Type.VEGGIES).build());
//                repo.save(new Ingredient.Builder("LETC", "Lettuce", Type.VEGGIES).build());
//                repo.save(new Ingredient.Builder("CHED", "Cheddar", Type.CHEESE).build());
//                repo.save(new Ingredient.Builder("JACK", "Monterrey Jack", Type.CHEESE).build());
//                repo.save(new Ingredient.Builder("SLSA", "Salsa", Type.SAUCE).build());
//                repo.save(new Ingredient.Builder("SRCR", "Sour Cream", Type.SAUCE).build());
                repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
                repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
                repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
                repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
                repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
                repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
                repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
                repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
                repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
                repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
            }
        };
    }
}
