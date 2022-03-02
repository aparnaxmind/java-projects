package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.entity.Studentinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/welcome")
    public String welcome(){
        return "hello";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "Java is easy to learn");
        return "message";

    }

    @RequestMapping(value = "studentData", method = RequestMethod.GET)
    public String studentInfo(Model model) {
        Studentinfo student=new Studentinfo();
        student.setName("Abhinav");
        student.setEmail("abhi@gmail.com");
        student.setAge(17);
        model.addAttribute("studentDetails", student);
        return "studentInfo";

    }

    @GetMapping("/articles")
    public ModelAndView getArticles(ModelAndView modelAndView) {
        Article a1=new Article("Two States","Chethan Bhagat");
        Article a2=new Article("Dollar Bahu","Sudha Moorthy");
        List<Article> articles=new ArrayList<Article>();
        articles.add(a1);
        articles.add(a2);
        modelAndView.addObject("articles", articles);

        modelAndView.setViewName("articles");
        return modelAndView;
    }



}
