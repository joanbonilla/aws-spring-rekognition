package com.amazon.aws.rekognition.endpoint;

import com.amazon.aws.rekognition.service.RekognitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ImageController {

    @Autowired
    private RekognitionService rekognitionService;

    @GetMapping("/images/labels")
    public Object getLabels() throws IOException {
        return ResponseEntity.ok(rekognitionService.getImageLabels());
    }

}
