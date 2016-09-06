package master.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bv on 9/6/2016.
 */
@Controller
public class TwitterController {

    @Autowired
    private Twitter twitter;

    @RequestMapping("/twitter")
    public String helloTwitter(@RequestParam(defaultValue =
            "masterSpringMVC4") String search, Model model){

        SearchResults searchResults = twitter.searchOperations().
                search(search);
        String text = searchResults.getTweets().get(0).getText();
        model.addAttribute("message", text);
        return "resultPage";

    }

}
