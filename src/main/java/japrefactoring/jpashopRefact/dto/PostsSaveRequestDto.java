package japrefactoring.jpashopRefact.dto;

import japrefactoring.jpashopRefact.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {  //dto -> entity
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }  //dto가 저장될때 엔티티로 변환되어 저장되야 하기 때문에 만든 메소드
}
