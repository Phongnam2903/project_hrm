package Models;

public class Vote {

    private int id;
    private int newsId;
    private String voteType;
    private int voteBy;

    public Vote() {
    }

    public Vote(int id, int newsId, String voteType, int voteBy) {
        this.id = id;
        this.newsId = newsId;
        this.voteType = voteType;
        this.voteBy = voteBy;
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

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(String voteType) {
        this.voteType = voteType;
    }

    public int getVoteBy() {
        return voteBy;
    }

    public void setVoteBy(int voteBy) {
        this.voteBy = voteBy;
    }

    @Override
    public String toString() {
        return "Vote{" + "id=" + id + ", newsId=" + newsId + ", voteType=" + voteType + ", voteBy=" + voteBy + '}';
    }

}
