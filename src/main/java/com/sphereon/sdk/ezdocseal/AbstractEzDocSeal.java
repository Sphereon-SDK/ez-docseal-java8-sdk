/**
 * Apache2
 */
package com.sphereon.sdk.ezdocseal;

import com.sphereon.sdk.ezdocseal.model.SignRequest;
import com.sphereon.sdk.ezdocseal.model.SignResult;
import javax.annotation.Generated;

/**
 * Abstract implementation of {@code EzDocSeal}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractEzDocSeal implements EzDocSeal {

    protected AbstractEzDocSeal() {
    }

    @Override
    public SignResult sign(SignRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

}
