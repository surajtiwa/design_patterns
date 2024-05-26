package designPatterns.creational.simpleFactory;

public class Client {

	public static void main(String[] args) {
		Post post=PostFactory.createPost("News");
		System.out.println(post);
		Post blogPost=PostFactory.createPost("Blog");
		System.out.println(blogPost);
		Post productPost=PostFactory.createPost("Product");
		System.out.println(productPost);
	}

}
