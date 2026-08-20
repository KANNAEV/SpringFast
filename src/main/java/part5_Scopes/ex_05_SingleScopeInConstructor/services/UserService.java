package part5_Scopes.ex_05_SingleScopeInConstructor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import part5_Scopes.ex_05_SingleScopeInConstructor.repositories.CommentRepository;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
