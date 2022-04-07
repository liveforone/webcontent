package japrefactoring.jpashopRefact.Controller;

import japrefactoring.jpashopRefact.domain.Posts;
import japrefactoring.jpashopRefact.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostsApiController {

    private final PostsService postsService;

    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
