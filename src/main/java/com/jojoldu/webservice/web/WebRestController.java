package com.rickkim90.webservice.web;

import com.rickkim90.webservice.dto.posts.PostsSaveRequestDto;
import com.rickkim90.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rickkim90@gmail.com on 2017. 12. 24.
 * Blog : http://rickkim90.tistory.com
 * Github : https://github.com/rickkim90
 */

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
