package com.example.assignment1;

import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.serializer.NumberAnchorGenerator;

import java.util.Random;
@Component
public class IdService {

    private NumberGenerator numberGenerator;

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();

        IdService idService = new IdService();
        idService.setNumberGenerator(numberGenerator);
        String id = idService.generate();
        System.out.println(id);
    }

    private void setNumberGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public String generate() {
        String id = "HELLO" + NumberGenerator.get();
        return id;
    }
}
@Component
class NumberGenerator {

    public static int get() {
        return new Random().nextInt(10);
    }
}