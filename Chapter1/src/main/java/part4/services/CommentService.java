package part4.services;

import org.springframework.stereotype.Component;
import part4.models.Comment;
import part4.proxies.CommentNotificationProxy;
import part4.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        System.out.print("\f");
        commentNotificationProxy.sendComment(comment);

    }
}
