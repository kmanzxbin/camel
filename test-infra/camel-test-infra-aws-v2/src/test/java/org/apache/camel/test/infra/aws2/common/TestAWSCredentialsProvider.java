/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.test.infra.aws2.common;

import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;

public class TestAWSCredentialsProvider implements AwsCredentialsProvider {
    public static final TestAWSCredentialsProvider CONTAINER_LOCAL_DEFAULT_PROVIDER
            = new TestAWSCredentialsProvider("accesskey", "secretkey");

    private AwsCredentials credentials;

    public TestAWSCredentialsProvider(String accessKey, String secretKey) {
        credentials = new TestAWSCredentials(accessKey, secretKey);
    }

    @Override
    public AwsCredentials resolveCredentials() {
        return credentials;
    }
}
