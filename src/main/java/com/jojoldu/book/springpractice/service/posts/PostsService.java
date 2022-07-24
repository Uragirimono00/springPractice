package com.jojoldu.book.springpractice.service.posts;

import com.jojoldu.book.springpractice.domain.posts.PostsRepository;
import com.jojoldu.book.springpractice.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {


    private final PostsRepository postsRepository;
    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
