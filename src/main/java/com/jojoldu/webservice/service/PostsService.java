package com.rickkim90.webservice.service;

import com.rickkim90.webservice.domain.posts.PostsRepository;
import com.rickkim90.webservice.dto.posts.PostsMainResponseDto;
import com.rickkim90.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rickkim90@gmail.com on 2017. 12. 27.
 * Blog : http://rickkim90.tistory.com
 * Github : https://github.com/rickkim90
 */

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
