/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/Sign" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private JsonSignRequest jsonSignRequest;

    /**
     * @param jsonSignRequest
     */

    public void setJsonSignRequest(JsonSignRequest jsonSignRequest) {
        this.jsonSignRequest = jsonSignRequest;
    }

    /**
     * @return
     */

    public JsonSignRequest getJsonSignRequest() {
        return this.jsonSignRequest;
    }

    /**
     * @param jsonSignRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest jsonSignRequest(JsonSignRequest jsonSignRequest) {
        setJsonSignRequest(jsonSignRequest);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJsonSignRequest() != null)
            sb.append("JsonSignRequest: ").append(getJsonSignRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignRequest == false)
            return false;
        SignRequest other = (SignRequest) obj;
        if (other.getJsonSignRequest() == null ^ this.getJsonSignRequest() == null)
            return false;
        if (other.getJsonSignRequest() != null && other.getJsonSignRequest().equals(this.getJsonSignRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonSignRequest() == null) ? 0 : getJsonSignRequest().hashCode());
        return hashCode;
    }

    @Override
    public SignRequest clone() {
        return (SignRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public SignRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
