package _2024_31_01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import _2024_31_01.taski.UniversityContainer;

import java.io.FileReader;
import java.io.IOException;

public class YP3 {
    public static void main(String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            FileReader reader = new FileReader("1.yaml");
            UniversityContainer testObject = objectMapper.readValue(reader, UniversityContainer.class);

            System.out.println(testObject.getUniversity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/**
 * [2 3 2]
 *
 *
 */