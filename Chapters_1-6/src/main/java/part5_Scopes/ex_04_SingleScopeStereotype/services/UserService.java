package part5_Scopes.ex_04_SingleScopeStereotype.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import part5_Scopes.ex_04_SingleScopeStereotype.repositories.CommentRepository;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
