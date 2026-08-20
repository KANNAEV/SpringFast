package part1.services;

import org.springframework.stereotype.Component;
import part1.models.Comment;
import part1.proxies.CommentNotificationProxy;
import part1.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        System.out.print("\f");
        commentNotificationProxy.sendComment(comment);

    }
}
