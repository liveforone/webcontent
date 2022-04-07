package japrefactoring.jpashopRefact.dto;

import japrefactoring.jpashopRefact.domain.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {  //조회시 사용

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {  //entity -> dto
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
