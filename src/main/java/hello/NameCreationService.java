package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NameCreationService {

    @Value("${name:World}")
    private String name;

    public String getName() {
        return name;
    }

}