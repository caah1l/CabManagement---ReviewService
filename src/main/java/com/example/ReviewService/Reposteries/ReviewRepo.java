package com.example.ReviewService.Reposteries;

import com.example.ReviewService.Models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepo extends JpaRepository<Review,Long> {

}
