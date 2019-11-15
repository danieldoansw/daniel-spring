package daniel.danielspring.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data // Lombok Library
//@RequiredArgsConstructor // Lombok Library
@Entity
public class Ingredient {

    @Id
    private String id;
    private String name;
    private Type type;

//    public static class Builder {
//
//        private final String id;
//        private final String name;
//        private final Type type;
//
//        public Builder(String id, String name, Type type) {
//            this.id = id;
//            this.name = name;
//            this.type = type;
//        }
//
//        public Ingredient build() {
//            return new Ingredient(this);
//        }
//    }
//
//    private Ingredient(Builder builder) {
//        id = builder.id;
//        name = builder.name;
//        type = builder.type;
//    }


    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Ingredient() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }


    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
