package java01_assassignment;

import java.util.Scanner;

public class ArticleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArticleController controller = new ArticleController();


        while(true){
            System.out.println("Enter your choice : ");
            System.out.println("1.Add Article");
            System.out.println("2.Show Article");
            System.out.println("3.Search Article");
            System.out.println("4.Delete Article");
            System.out.println("0.Exit");
            System.out.println("Your choice is:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    controller.createArticle();
                    break;
                case 2:
                    controller.showArticle();
                    break;
                case 3:
                    controller.searchArticle();
                    break;
                case 4:
                    controller.deleteArticle();
                    break;

            }if(choice == 0) {
                System.out.println("Thank you for using our system, goodbye and good luck ");
                break;
            }
        }

    }
}
