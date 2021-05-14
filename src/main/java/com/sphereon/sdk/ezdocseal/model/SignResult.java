/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/Sign" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private JsonSignResponse jsonSignResponse;

    /**
     * @param jsonSignResponse
     */

    public void setJsonSignResponse(JsonSignResponse jsonSignResponse) {
        this.jsonSignResponse = jsonSignResponse;
    }

    /**
     * @return
     */

    public JsonSignResponse getJsonSignResponse() {
        return this.jsonSignResponse;
    }

    /**
     * @param jsonSignResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignResult jsonSignResponse(JsonSignResponse jsonSignResponse) {
        setJsonSignResponse(jsonSignResponse);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJsonSignResponse() != null)
            sb.append("JsonSignResponse: ").append(getJsonSignResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignResult == false)
            return false;
        SignResult other = (SignResult) obj;
        if (other.getJsonSignResponse() == null ^ this.getJsonSignResponse() == null)
            return false;
        if (other.getJsonSignResponse() != null && other.getJsonSignResponse().equals(this.getJsonSignResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonSignResponse() == null) ? 0 : getJsonSignResponse().hashCode());
        return hashCode;
    }

    @Override
    public SignResult clone() {
        try {
            return (SignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
