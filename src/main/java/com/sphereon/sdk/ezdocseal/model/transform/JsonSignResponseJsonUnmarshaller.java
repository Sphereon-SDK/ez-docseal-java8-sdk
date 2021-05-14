/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.sphereon.sdk.ezdocseal.model.JsonSignResponse;
import javax.annotation.Generated;

/**
 * JsonSignResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonSignResponseJsonUnmarshaller implements Unmarshaller<JsonSignResponse, JsonUnmarshallerContext> {

    public JsonSignResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        JsonSignResponse jsonSignResponse = new JsonSignResponse();

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
                    jsonSignResponse.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jsonSignResponse;
    }

    private static JsonSignResponseJsonUnmarshaller instance;

    public static JsonSignResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JsonSignResponseJsonUnmarshaller();
        return instance;
    }
}
