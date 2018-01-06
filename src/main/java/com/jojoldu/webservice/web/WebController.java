package com.rickkim90.webservice.web;

import com.rickkim90.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by rickkim90@gmail.com on 2017. 12. 31.
 * Blog : http://rickkim90.tistory.com
 * Github : https://github.com/rickkim90
 */

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
}
