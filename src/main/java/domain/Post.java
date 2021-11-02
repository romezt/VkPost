package domain;

public class Post {

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendOnly;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private Donut donut;
    private int postponedId;

    private String avatarUrl;
    private String publicName;
    private String dateAndTimeOfPost;    // private int date;
    private Accordion accordion;
    private String textOfPost;           // private String text;
    private AddToFavorite addToFavorite; // private boolean isFavorite;
    private String nameOfArticle;
    private String linkToArticle;        // private Copyright copyright;
    private LikesInfo likesInfo;         // object likes
    private CommentsInfo commentsInfo;   // object comments
    private RepostsInfo repostsInfo;     // object reposts
    private ViewsInfo viewsInfo;         // object views

    // + getters/setters
}
