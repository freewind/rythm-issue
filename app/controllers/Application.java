package controllers;

import com.avaje.ebean.Ebean;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        if (Article.find.findRowCount() == 0) {
            init();
        }
        List<Article> articles = Article.find.findList();
        Article single = articles.get(0);
        render(articles, single);
    }


    private static void init() {
        Category category = new Category();
        category.name = "java";
        category.save();

        Article article = new Article();
        article.category = category;
        article.save();
    }

}