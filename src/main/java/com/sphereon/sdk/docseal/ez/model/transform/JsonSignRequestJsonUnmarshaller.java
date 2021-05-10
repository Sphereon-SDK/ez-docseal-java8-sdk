/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.sphereon.sdk.docseal.ez.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JsonSignRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonSignRequestJsonUnmarshaller implements Unmarshaller<JsonSignRequest, JsonUnmarshallerContext> {

    public JsonSignRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        JsonSignRequest jsonSignRequest = new JsonSignRequest();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("content", targetDepth)) {
                    context.nextToken();
                    jsonSignRequest.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signData", targetDepth)) {
                    context.nextToken();
                    jsonSignRequest.setSignData(SignDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jsonSignRequest;
    }

    private static JsonSignRequestJsonUnmarshaller instance;

    public static JsonSignRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JsonSignRequestJsonUnmarshaller();
        return instance;
    }
}
