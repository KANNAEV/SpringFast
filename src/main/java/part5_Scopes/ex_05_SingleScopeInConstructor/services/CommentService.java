package part5_Scopes.ex_05_SingleScopeInConstructor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import part5_Scopes.ex_05_SingleScopeInConstructor.repositories.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(@Autowired CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
