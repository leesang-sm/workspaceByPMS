package com.ds.pms.springboot.web;

import com.ds.pms.springboot.service.PostsService;
import com.ds.pms.springboot.web.dto.PostSaveRequestDto;
import com.ds.pms.springboot.web.dto.PostsResponseDto;
import com.ds.pms.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }

    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}

