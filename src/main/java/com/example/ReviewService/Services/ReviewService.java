package com.example.ReviewService.Services;

import com.example.ReviewService.Models.Review;
import com.example.ReviewService.Reposteries.ReviewRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepo reviewRepo;

    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("************");
        Review r = Review.builder()
                .comments("Amazing ride 2")
                .ratings(4.5)
//                updatedAt(new Date()).
//                createdAt(new Date())
                .build();  //create a POJO

        reviewRepo.save(r); // executes SQL query
    }
}
