package com.empreview.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.Arrays;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private FeedbackDao feedbackDao;

    @Autowired
    private FeedbackServiceImpl feedbackService;

    // Login form
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    // Login form with error
//    @RequestMapping("/login-error")
//    public String loginError(Model model) {
//        model.addAttribute("loginError", true);
//        return "login";
//    }

    @GetMapping("/greeting")
    @PermitAll
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/feedback")
    @PermitAll
    public String feedBack(Model model) {
        model.addAttribute("feedbackDao", feedbackDao);
        List<String> userList = Arrays.asList("Person1", "Person2", "Person3", "Person4");
        model.addAttribute("userList", userList);
        return "feedback_form";
    }

    @PostMapping("/feedback")
    @PermitAll
    public String submitFeedback(@ModelAttribute("feedbackDao") FeedbackDao feedbackDao) {
        String msg = feedbackService.submitFeedback(feedbackDao);
        return "feedback_success";
    }

}
