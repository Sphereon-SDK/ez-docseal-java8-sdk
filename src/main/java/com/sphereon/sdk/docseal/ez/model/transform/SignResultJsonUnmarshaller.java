/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.sphereon.sdk.docseal.ez.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SignResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignResultJsonUnmarshaller implements Unmarshaller<SignResult, JsonUnmarshallerContext> {

    public SignResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SignResult signResult = new SignResult();

        return signResult;
    }

    private static SignResultJsonUnmarshaller instance;

    public static SignResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SignResultJsonUnmarshaller();
        return instance;
    }
}
