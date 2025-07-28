package main.java.me.wihteship.designpatterns._09_decorator;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
