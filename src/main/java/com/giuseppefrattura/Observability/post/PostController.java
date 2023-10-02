package com.giuseppefrattura.Observability.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final JsonPlaceholderService jsonPlaceholderService;

    public PostController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    @GetMapping("")
    List<Post> findAll(){
        return jsonPlaceholderService.findAll();
    }

    @GetMapping("/{id}")
    Post findByID(@PathVariable Integer id){
        return jsonPlaceholderService.findById(id);
    }

}
