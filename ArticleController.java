package java01_assassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleController {
    ArrayList<Article> articles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //=============================================================
    //Các hàm  .
    public void createArticle() {
        System.out.println("Enter id of article you want to create: ");
        long articleId =  sc.nextLong();
        sc.nextLine();
        System.out.println("Enter title of article: ");
        String articleTitle =  sc.nextLine();
        System.out.println("Enter description of article: ");
        String articleDescription =  sc.nextLine();
        System.out.println("Add author avatar:(you can use link or url)");
        String authorAvatar =  sc.nextLine();
        System.out.println("Enter main content of article: ");
        String articleMainContent =  sc.nextLine();
        System.out.println("Enter author name of article: ");
        String authorName =  sc.nextLine();
        System.out.println("Publication date: ");
        String publicationDate =  sc.nextLine();
        sc.nextLine();

        Article article = new Article();
        articles.add(article);
        article.setId(articleId);
        article.setTitle(articleTitle);
        article.setDescription(articleDescription);
        article.setAuthor(authorName);
        article.setAvatar(authorAvatar);
        article.setMain_content(articleMainContent);
        article.setDate(publicationDate);
        System.out.println("Congratulations! You have created a new article!");

    }

    // Hien thi thong tin cua bai viet
    public void showArticle() {
        System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Title", "Description", "Avatar", "Author","Main Content","Publication Date");
        for (int i = 0; i < articles.size(); i++) {
            Article pl = articles.get(i);
            System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", pl.getId(), pl.getTitle(), pl.getDescription(), pl.getAvatar(), pl.getAuthor(),pl.getMain_content(), pl.getDate());
        }
        System.out.println("Press Enter to continue.");
        sc.nextLine();
    }


    //Tim kiem bai viet theo ma trong ArrayList<>
    public void searchArticle() {
        System.out.println("Enter post ID: ");
        long postID = sc.nextLong();
        sc.nextLine();
        long key = -1;
        for (int i = 0; i < articles.size(); i++) {
            Article art = articles.get(i);
            if (art.getId() == postID) {
                key = postID;
                System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Article title", "describe", "Avatar", "Arthur","Main Content", "publication date");
                System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s||%-10s\n", art.getId(), art.getTitle(), art.getDescription(), art.getAvatar(),art.getMain_content(), art.getAuthor(), art.getDate());
            }
        }
        if (key == -1) {
            System.out.println("Article does not exist");
        }
    }

    //Xoa bai viet dua vao id duoc nhap
    public void deleteArticle(){
        System.out.println("Enter post ID: ");
        long postID = sc.nextLong();
        sc.nextLine();
        long key = -1;
        for (int i = 0; i < articles.size(); i++) {
            Article art = articles.get(i);
            if (art.getId() == postID) {
                key = postID;
                articles.remove(i);
                System.out.println("Deleted successfully");
            }
        }
        if (key == -1) {
            System.out.println("Post not found");
        }
    }
}
