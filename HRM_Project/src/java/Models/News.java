package Models;

import java.util.Date;

public class News {

    private int id;
    private String title;
    private String content;
    private Date postDate;
    private int postedBy;
    private int companyId;

    public News() {
    }

    public News(int id, String title, String content, Date postDate, int postedBy, int companyId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.postedBy = postedBy;
        this.companyId = companyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(int postedBy) {
        this.postedBy = postedBy;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "News{" + "id=" + id + ", title=" + title + ", content=" + content + ", postDate=" + postDate + ", postedBy=" + postedBy + ", companyId=" + companyId + '}';
    }

}
