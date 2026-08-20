package part5_Scopes.ex_01_SingleToneAndSingleScope.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import part5_Scopes.ex_01_SingleToneAndSingleScope.models.Comment;
import part5_Scopes.ex_01_SingleToneAndSingleScope.proxies.CommentNotificationProxy;
import part5_Scopes.ex_01_SingleToneAndSingleScope.repositories.CommentRepository;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        System.out.print("\f");
        commentNotificationProxy.sendComment(comment);

    }
}
