package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static Map<String, String> dictionary;

    static {
        dictionary = new HashMap<>();

        dictionary.put("eat", "ăn");
        dictionary.put("drink", "uống");
        dictionary.put("run", "chạy");
    }

    @GetMapping("/translate")
    public String translateEnglish(@RequestParam String englishWord, Model model){
        String vietnameseWord=dictionary.get(englishWord);
        if(dictionary.containsKey(englishWord)){
            model.addAttribute("englishWord",englishWord);
            model.addAttribute("vietnameseWord", vietnameseWord);
        }else{
            model.addAttribute("englishWord","Not Found");
        }
        return "translate";
    }

    @GetMapping("/")
    public  String showResult(){
        return "translate";
    }
}
