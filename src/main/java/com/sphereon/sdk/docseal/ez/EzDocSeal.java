/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.sphereon.sdk.docseal.ez.model.*;

/**
 * Interface for accessing EzDocSeal.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface EzDocSeal {

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample EzDocSeal.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/GetApiRoot" target="_top">AWS API
     *      Documentation</a>
     */
    GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest);

    /**
     * @param signRequest
     * @return Result of the sign operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @sample EzDocSeal.sign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/sign" target="_top">AWS API Documentation</a>
     */
    SignResult sign(SignRequest signRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static EzDocSealClientBuilder builder() {
        return new EzDocSealClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
