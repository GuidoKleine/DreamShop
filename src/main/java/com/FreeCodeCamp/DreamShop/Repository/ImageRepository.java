package com.FreeCodeCamp.DreamShop.Repository;

import com.FreeCodeCamp.DreamShop.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
