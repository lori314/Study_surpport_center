import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @PostMapping("/upload-data")
    public UploadedData uploadData(@RequestBody DataPayload payload) {
        // Process the uploaded text and image here
        String text = payload.getText();
        String image = payload.getImage();

        // Perform necessary backend tasks with the received text and image
        // ...

        // Return a response to the frontend
        return new UploadedData("Data received and processed successfully");
    }
}

class DataPayload {
    private String text;
    private String image;

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }
}

class UploadedData {
    private String message;

    public UploadedData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}