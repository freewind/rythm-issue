package models;

import play.modules.ebean.Model;
import play.modules.ebean.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article extends Model {

    @Id
    @UUID
    public String id;

    @ManyToOne
    public Category category;

    public static final Finder<String, Article> find = new Finder<String, Article>(String.class, Article.class);

}