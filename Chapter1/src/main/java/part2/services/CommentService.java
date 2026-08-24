package part2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import part2.models.Comment;
import part2.proxies.CommentNotificationProxy;
import part2.repositories.CommentRepository;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;


    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        System.out.print("\f");
        commentNotificationProxy.sendComment(comment);

    }
}
