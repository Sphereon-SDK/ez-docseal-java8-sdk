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
 * SignDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SignDataMarshaller {

    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("emailAddress").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();

    private static final SignDataMarshaller instance = new SignDataMarshaller();

    public static SignDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SignData signData, ProtocolMarshaller protocolMarshaller) {

        if (signData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(signData.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(signData.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(signData.getName(), NAME_BINDING);
            protocolMarshaller.marshall(signData.getReason(), REASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
