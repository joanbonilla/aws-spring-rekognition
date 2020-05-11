package com.amazon.aws.rekognition.service;

import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectLabelsResult;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.Label;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@Service
public class RekognitionService {

    private AmazonRekognition client;

    public RekognitionService(AmazonRekognition client) {
        this.client = client;
    }

    public DetectLabelsResult getImageLabels() throws IOException {

        ClassPathResource classPathResource = new ClassPathResource("static/messi.png");

        System.out.println("Detected labels for " + classPathResource.getInputStream().toString());

        InputStream imageStream = classPathResource.getInputStream();
        byte[] targetArray = StreamUtils.copyToByteArray(imageStream);

        DetectLabelsRequest request = new DetectLabelsRequest().withImage(
                new Image().withBytes(ByteBuffer.wrap(targetArray)));

        DetectLabelsResult result = client.detectLabels(request);
        List<Label> labels = result.getLabels();

        for (Label label : labels) {
            System.out.println("Label: '" + label.getName()
                    .concat("', Confidence: " + label.getConfidence().toString() + "%"));
        }

        return result;
    }

}