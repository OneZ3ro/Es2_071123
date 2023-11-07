package angelomoreno.Es2_071123.controllers;

import angelomoreno.Es2_071123.entities.Blog;
import angelomoreno.Es2_071123.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    private BlogService blogService;

    @GetMapping("")
    public List<Blog> getBlogs() {
        return blogService.getBlogs();
    }
}
