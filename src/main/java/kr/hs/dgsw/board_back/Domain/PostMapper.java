package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findAllPost();
    Post findByPostId(Long id);
    Long addPost(Post post);
    int modifyPost(Post post);
    int deleteByPostId(Long id);
    List<Post> findByUserId(Long userId);
    Long addWithHashMap(HashMap<String, Object> map);
}
