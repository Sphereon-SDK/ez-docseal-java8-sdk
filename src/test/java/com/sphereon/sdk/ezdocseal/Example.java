package com.sphereon.sdk.ezdocseal;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;
import com.amazonaws.util.Base64;
import com.sphereon.sdk.ezdocseal.model.JsonSignRequest;
import com.sphereon.sdk.ezdocseal.model.SignData;
import com.sphereon.sdk.ezdocseal.model.SignRequest;
import com.sphereon.sdk.ezdocseal.model.SignResult;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.Test;

public class Example {

    @Test
    public void example() throws IOException, URISyntaxException {
        // Read a file into a base64 encoded string
        final File pdfFile = new File(getClass().getClassLoader().getResource("dummy.pdf").toURI());
        final byte[] inputPdfBytes = Files.readAllBytes(pdfFile.toPath());
        final String pdfContent = Base64.encodeAsString(inputPdfBytes);


        // Create the client
        EzDocSeal client = EzDocSeal.builder()
          // The API Key. Replace with your API key!
          .apiKey("NkpWSRaVhy57QwCquzcC435jOxcPIFiR3ubloH6L")

          // Connection configuration
          .connectionConfiguration(new ConnectionConfiguration()
            .maxConnections(100)
            .connectionMaxIdleMillis(1000))

          // Timeouts
          .timeoutConfiguration(new TimeoutConfiguration()
            .httpRequestTimeout(5000)
            .totalExecutionTimeout(30000)
            .socketTimeout(2000))
          .build();


        // Create the actual sign request body
        final SignRequest signRequest = new SignRequest().jsonSignRequest(
          new JsonSignRequest().signData(
            new SignData()
              .emailAddress("test@example.com")
              .name("Bob the Builder")
              .location("New York, USA")
              .reason("Approved")
          ).content(
            pdfContent
          )
        );

        // Call the sign API
        final SignResult result = client.sign(signRequest);

        // Base64 decode the returned content that contains the signed PDF
        final byte[] signedPdfBytes = Base64.decode(result.getJsonSignResponse().getContent());

        // Write the PDF data
        final Path outputPath = Files.write(new File("signed-example-output.pdf").toPath(), signedPdfBytes);

        outputPath.toFile().deleteOnExit();

    }

}
