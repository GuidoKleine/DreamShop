package com.FreeCodeCamp.DreamShop.Service.Image;

import com.FreeCodeCamp.DreamShop.Entity.Image;
import com.FreeCodeCamp.DreamShop.dto.ImageDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);

    void updateImage(MultipartFile file, Long ImageId);
}
