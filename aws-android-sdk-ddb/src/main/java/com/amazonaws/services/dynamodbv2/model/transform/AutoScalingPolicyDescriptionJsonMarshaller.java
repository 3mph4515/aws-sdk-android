/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoScalingPolicyDescription
 */
class AutoScalingPolicyDescriptionJsonMarshaller {

    public void marshall(AutoScalingPolicyDescription autoScalingPolicyDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingPolicyDescription.getPolicyName() != null) {
            String policyName = autoScalingPolicyDescription.getPolicyName();
            jsonWriter.name("PolicyName");
            jsonWriter.value(policyName);
        }
        if (autoScalingPolicyDescription.getTargetTrackingScalingPolicyConfiguration() != null) {
            AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration = autoScalingPolicyDescription
                    .getTargetTrackingScalingPolicyConfiguration();
            jsonWriter.name("TargetTrackingScalingPolicyConfiguration");
            AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionJsonMarshaller
                    .getInstance().marshall(targetTrackingScalingPolicyConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AutoScalingPolicyDescriptionJsonMarshaller instance;

    public static AutoScalingPolicyDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyDescriptionJsonMarshaller();
        return instance;
    }
}
