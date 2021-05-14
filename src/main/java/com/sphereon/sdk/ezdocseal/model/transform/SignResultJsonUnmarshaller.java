/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal.model.transform;

import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.sphereon.sdk.ezdocseal.model.SignResult;
import javax.annotation.Generated;

/**
 * SignResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignResultJsonUnmarshaller implements Unmarshaller<SignResult, JsonUnmarshallerContext> {

    public SignResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SignResult signResult = new SignResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return signResult;
        }

        while (true) {
            if (token == null)
                break;

            signResult.setJsonSignResponse(JsonSignResponseJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return signResult;
    }

    private static SignResultJsonUnmarshaller instance;

    public static SignResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SignResultJsonUnmarshaller();
        return instance;
    }
}
