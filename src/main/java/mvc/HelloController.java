package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam(value = "num1") String num1,
            @RequestParam(value = "num2") String num2, @RequestParam(value = "op") String op) {
        double result = 0;
        switch (op) {
            case "+":
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                break;
            case "-":
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                break;
            case "*":
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                break;
            case "/":
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                break;

            default:
                break;
        }

        Message message = new Message(num1, num2, op, result);

        Map<String, Object> params = new HashMap<>();
        params.put("message", message);

        return new ModelAndView("hello", params);
    }
}
