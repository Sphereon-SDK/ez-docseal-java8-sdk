/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal;

import com.sphereon.sdk.ezdocseal.model.BadRequestException;
import com.sphereon.sdk.ezdocseal.model.InternalServerErrorException;
import com.sphereon.sdk.ezdocseal.model.SignRequest;
import com.sphereon.sdk.ezdocseal.model.SignResult;
import javax.annotation.Generated;

/**
 * Interface for accessing EzDocSeal.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface EzDocSeal {

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
