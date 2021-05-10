/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import com.sphereon.sdk.docseal.ez.model.*;
import com.sphereon.sdk.docseal.ez.model.transform.*;

/**
 * Client for accessing EzDocSeal. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class EzDocSealClient implements EzDocSeal {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.sphereon.sdk.docseal.ez.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.sphereon.sdk.docseal.ez.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.sphereon.sdk.docseal.ez.model.EzDocSealException.class));

    /**
     * Constructs a new client to invoke service methods on EzDocSeal using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    EzDocSealClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample EzDocSeal.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/GetApiRoot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest) {
        HttpResponseHandler<GetApiRootResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetApiRootResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetApiRootRequest, GetApiRootResult>()
                .withMarshaller(new GetApiRootRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getApiRootRequest));
    }

    /**
     * @param signRequest
     * @return Result of the sign operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @sample EzDocSeal.sign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/sign" target="_top">AWS API Documentation</a>
     */
    @Override
    public SignResult sign(SignRequest signRequest) {
        HttpResponseHandler<SignResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new SignResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(BadRequestException.class).withHttpStatusCode(400), new JsonErrorShapeMetadata()
                        .withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500));

        return clientHandler.execute(new ClientExecutionParams<SignRequest, SignResult>().withMarshaller(new SignRequestProtocolMarshaller(protocolFactory))
                .withResponseHandler(responseHandler).withErrorResponseHandler(errorResponseHandler).withInput(signRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
