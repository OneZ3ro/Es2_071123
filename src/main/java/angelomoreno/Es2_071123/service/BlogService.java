package angelomoreno.Es2_071123.service;

import angelomoreno.Es2_071123.entities.Blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlogService {
    private List<Blog> blogs = new ArrayList<>();

    public Blog save(Blog body) {
        Random rndm = new Random();
        body.setId(rndm.nextLong(1, 100000L));
        this.blogs.add(body);
        return body;
    }

    public List<Blog> getBlogs() {
        return this.blogs;
    }
}
