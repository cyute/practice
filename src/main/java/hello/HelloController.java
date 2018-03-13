package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private NameCreationService nameCreationService;

    @Autowired
    private HelloConfigurationProperties properties;

    @RequestMapping(value = "/")
    public List<String> getHelloWorld() {
        List<String> names = new ArrayList<>();
        names.add(nameCreationService.getName());
        names.add(properties.getName());
        names.add("Carl");
        System.out.println(names.toString());
        return names;
    }
}