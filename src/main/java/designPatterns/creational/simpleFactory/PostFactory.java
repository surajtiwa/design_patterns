package designPatterns.creational.simpleFactory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {

    static Post createPost(String type) {
        switch (type) {
            case "Blog":
                return new BlogPost();

            case "News":
                return new NewsPost();

            case "Product":
                return new ProductPost();

            default:
                return new BlogPost();
        }
    }

}
