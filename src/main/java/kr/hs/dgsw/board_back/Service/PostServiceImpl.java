package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Domain.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMapper;

    @Override
    public List<Post> findAllPost() {
        return this.postMapper.findAllPost();
    }

    @Override
    public int deleteByPostId(Long id) {
        return this.postMapper.deleteByPostId(id);
    }

    @Override
    public Long addPost(Post post) {
        return this.postMapper.addPost(post);
    }

    @Override
    public int modifyPost(Post post) {
        return this.postMapper.modifyPost(post);
    }

    @Override
    public Post findByPostId(Long id) {
        return this.postMapper.findByPostId(id);
    }

    @Override
    public List<Post> findByUserId(Long userId) {
        return this.postMapper.findByUserId(userId);
    }

    @Override
    public Long addWithHashMap(Post post) {
        HashMap map = new HashMap<String, Object>();
        map.put("userId", post.getUserId());
        map.put("title", post.getTitle());
        map.put("content", post.getContent());
        return this.postMapper.addWithHashMap(map);
    }
}
