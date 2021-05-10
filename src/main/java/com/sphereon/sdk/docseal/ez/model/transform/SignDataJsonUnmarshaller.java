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
 * SignData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignDataJsonUnmarshaller implements Unmarshaller<SignData, JsonUnmarshallerContext> {

    public SignData unmarshall(JsonUnmarshallerContext context) throws Exception {
        SignData signData = new SignData();

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
                if (context.testExpression("emailAddress", targetDepth)) {
                    context.nextToken();
                    signData.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    signData.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    signData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    signData.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return signData;
    }

    private static SignDataJsonUnmarshaller instance;

    public static SignDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SignDataJsonUnmarshaller();
        return instance;
    }
}
