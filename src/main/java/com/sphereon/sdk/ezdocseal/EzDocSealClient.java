/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal;

import com.amazonaws.SdkBaseException;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.protocol.json.JsonClientMetadata;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.JsonErrorShapeMetadata;
import com.amazonaws.protocol.json.JsonOperationMetadata;
import com.sphereon.sdk.ezdocseal.model.BadRequestException;
import com.sphereon.sdk.ezdocseal.model.EzDocSealException;
import com.sphereon.sdk.ezdocseal.model.InternalServerErrorException;
import com.sphereon.sdk.ezdocseal.model.SignRequest;
import com.sphereon.sdk.ezdocseal.model.SignResult;
import com.sphereon.sdk.ezdocseal.model.transform.SignRequestProtocolMarshaller;
import com.sphereon.sdk.ezdocseal.model.transform.SignResultJsonUnmarshaller;
import java.util.Arrays;
import javax.annotation.Generated;

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
                                    BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(EzDocSealException.class));

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
