package angelomoreno.Es2_071123.service;

import angelomoreno.Es2_071123.entities.Blog;
import angelomoreno.Es2_071123.enums.Categoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
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

    public Blog findById(long id) {
        Blog appBlog = new Blog();
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) {
                appBlog = blog;
            }
        }
        if (appBlog == null) {
            throw new RuntimeException("Blog non trovato");
        } else {
            return appBlog;
        }
    }
}
