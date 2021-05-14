/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal;

import com.amazonaws.Protocol;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.util.RuntimeHttpUtils;
import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link EzDocSeal}.
 * 
 * @see EzDocSeal#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class EzDocSealClientBuilder extends SdkSyncClientBuilder<EzDocSealClientBuilder, EzDocSeal> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("api.dev.sphereon.io", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-west-1";

    /**
     * Package private constructor - builder should be created via {@link EzDocSeal#builder()}
     */
    EzDocSealClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey
     *        API Key that identifies caller.
     * @return This object for method chaining.
     */
    @Override
    public void setApiKey(String apiKey) {
        super.setApiKey(apiKey);
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey
     *        API Key that identifies caller.
     * @return This object for method chaining.
     */
    public EzDocSealClientBuilder apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * Construct a synchronous implementation of EzDocSeal using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of EzDocSeal.
     */
    @Override
    protected EzDocSeal build(AwsSyncClientParams params) {
        return new EzDocSealClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
