package Models;

import java.util.Date;

public class Comment {

    private int id;
    private int newsId;
    private String comment;
    private Date commentDate;
    private int commentedBy;

    public Comment() {
    }

    public Comment(int id, int newsId, String comment, Date commentDate, int commentedBy) {
        this.id = id;
        this.newsId = newsId;
        this.comment = comment;
        this.commentDate = commentDate;
        this.commentedBy = commentedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public int getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(int commentedBy) {
        this.commentedBy = commentedBy;
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", newsId=" + newsId + ", comment=" + comment + ", commentDate=" + commentDate + ", commentedBy=" + commentedBy + '}';
    }

}
