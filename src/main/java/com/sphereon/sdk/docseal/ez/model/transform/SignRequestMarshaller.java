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
 * SignRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SignRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> JSONSIGNREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final SignRequestMarshaller instance = new SignRequestMarshaller();

    public static SignRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SignRequest signRequest, ProtocolMarshaller protocolMarshaller) {

        if (signRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(signRequest.getJsonSignRequest(), JSONSIGNREQUEST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
