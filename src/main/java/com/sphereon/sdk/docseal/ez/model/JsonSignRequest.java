/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-0.1.0/JsonSignRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonSignRequest implements Serializable, Cloneable, StructuredPojo {

    private String content;

    private SignData signData;

    /**
     * @param content
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return
     */

    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonSignRequest content(String content) {
        setContent(content);
        return this;
    }

    /**
     * @param signData
     */

    public void setSignData(SignData signData) {
        this.signData = signData;
    }

    /**
     * @return
     */

    public SignData getSignData() {
        return this.signData;
    }

    /**
     * @param signData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonSignRequest signData(SignData signData) {
        setSignData(signData);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getSignData() != null)
            sb.append("SignData: ").append(getSignData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonSignRequest == false)
            return false;
        JsonSignRequest other = (JsonSignRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getSignData() == null ^ this.getSignData() == null)
            return false;
        if (other.getSignData() != null && other.getSignData().equals(this.getSignData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getSignData() == null) ? 0 : getSignData().hashCode());
        return hashCode;
    }

    @Override
    public JsonSignRequest clone() {
        try {
            return (JsonSignRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.sphereon.sdk.docseal.ez.model.transform.JsonSignRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
