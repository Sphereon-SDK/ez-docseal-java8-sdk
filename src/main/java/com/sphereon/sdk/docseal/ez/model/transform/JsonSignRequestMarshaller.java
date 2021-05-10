/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.sphereon.sdk.docseal.ez.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JsonSignRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JsonSignRequestMarshaller {

    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("content").build();
    private static final MarshallingInfo<StructuredPojo> SIGNDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signData").build();

    private static final JsonSignRequestMarshaller instance = new JsonSignRequestMarshaller();

    public static JsonSignRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JsonSignRequest jsonSignRequest, ProtocolMarshaller protocolMarshaller) {

        if (jsonSignRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jsonSignRequest.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(jsonSignRequest.getSignData(), SIGNDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
