package com.rickkim90.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

/**
 * Created by rickkim90@gmail.com on 2017. 12. 23.
 * Blog : http://rickkim90.tistory.com
 * Github : https://github.com/rickkim90
 */

public interface PostsRepository extends JpaRepository<Posts, Long>{

    @Query("SELECT p " +
            "FROM Posts p " +
            "ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();
}
