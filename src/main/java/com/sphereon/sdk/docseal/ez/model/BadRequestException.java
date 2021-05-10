/**
 * APACHE2
 */
package com.sphereon.sdk.docseal.ez.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.sphereon.sdk.docseal.ez.model.EzDocSealException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException code(String code) {
        setCode(code);
        return this;
    }

}
