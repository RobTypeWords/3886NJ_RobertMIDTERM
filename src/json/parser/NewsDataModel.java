package json.parser;

public class NewsDataModel {


    private String Source;
    private String Author;
    private String Title;
    private String Description;
    private String URL;
    private String URLToImage;
    private String PublishedAt;
    private String Content;

    NewsDataModel(){}

    NewsDataModel(String source, String author, String title, String description, String url, String urlToImage, String publishedAt, String content){

  this.Source = source;
  this.Author = author;
  this.Title = title;
  this.Description = description;
  this.URL = url;
  this.URLToImage = url;
  this.PublishedAt = publishedAt;
  this.Content = content;

    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURLToImage() {
        return URLToImage;
    }

    public void setURLToImage(String URLToImage) {
        this.URLToImage = URLToImage;
    }

    public String getPublishedAt() {
        return PublishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        PublishedAt = publishedAt;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}

