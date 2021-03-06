/*
 * Copyright 2012-2015 One Platform Foundation
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

package org.onepf.opfpush.notification;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * The interface intended to create notifications from bundle data.
 *
 * @author Roman Savin
 * @since 23.06.2015
 */
public interface NotificationMaker {

    /**
     * Returns true if a notification must be shown for the bundle. False otherwise.
     *
     * @param bundle The bundle received from a push provider.
     * @return Returns true if a notification should be shown for the bundle. False otherwise.
     */
    boolean needShowNotification(@NonNull final Bundle bundle);

    /**
     * Shows notification using bundle data.
     *
     * @param context The Context instance.
     * @param bundle  Received data.
     */
    void showNotification(@NonNull final Context context, @NonNull final Bundle bundle);
}
