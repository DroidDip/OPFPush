/*
 * Copyright 2012-2014 One Platform Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onepf.opfpush.gcm;

import com.google.android.gms.gcm.GoogleCloudMessaging;

/**
 * @author Kirill Rozov
 * @author Roman Savin
 * @since 06.09.14.
 */
public final class GCMConstants {

    private GCMConstants() {
        throw new UnsupportedOperationException();
    }

    public static final String PROVIDER_NAME = "Google Cloud Messaging";

    static final String ACTION_REGISTRATION = "com.google.android.c2dm.intent.REGISTRATION";
    static final String ACTION_REGISTRATION_CALLBACK = BuildConfig.APPLICATION_ID + ".intent.REGISTRATION";
    static final String ACTION_UNREGISTRATION_CALLBACK = BuildConfig.APPLICATION_ID + ".intent.UNREGISTRATION";

    static final String EXTRA_ERROR_ID = "error_id";
    static final String EXTRA_REGISTRATION_ID = "registration_id";
    static final String ERROR_AUTHENTICATION_FAILED = "AUTHENTICATION_FAILED";
    static final String ERROR_SERVICE_NOT_AVAILABLE = GoogleCloudMessaging.ERROR_SERVICE_NOT_AVAILABLE;

    static final String GOOGLE_PLAY_APP_PACKAGE = "com.android.vending";

    static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    static final String ANDROID_RELEASE_4_0_4 = "4.0.4";

    static final String PERMISSION_RECEIVE = "com.google.android.c2dm.permission.RECEIVE";
    static final String PERMISSION_C2D_MESSAGE_SUFFIX = ".permission.C2D_MESSAGE";
    static final String GOOGLE_CLOUD_MESSAGING_CLASS_NAME = "com.google.android.gms.gcm.GoogleCloudMessaging";
    static final String MESSAGES_TO_SUFFIX = "@gcm.googleapis.com";
}
