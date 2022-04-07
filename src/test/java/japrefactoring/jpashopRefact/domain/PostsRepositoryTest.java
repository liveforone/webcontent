package japrefactoring.jpashopRefact.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach  //단위테스트 끝날때마다 실행될 메소드, junit5에선 @After대신 @AfterEach가 쓰인다.
    public void cleanup() {
        postsRepository.deleteAll();  //테스트 끝나면 그 내용도 지움
    }

    @Test
    public void 게시글등록_불러오기테스트() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("홍길동")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();  //게시글 등록되었나 불러오기

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

}