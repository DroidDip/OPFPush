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

package org.onepf.opfpush.nokia;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.onepf.opfpush.listener.CheckManifestHandler;
import org.onepf.opfpush.model.AvailabilityResult;
import org.onepf.opfpush.notification.NotificationMaker;
import org.onepf.opfutils.OPFLog;

import static org.onepf.opfpush.nokia.NokiaPushConstants.NOKIA_MANUFACTURER;

/**
 * Nokia Notification push provider delegate.
 *
 * @author Kirill Rozov
 * @author Roman Savin
 * @see <a href="http://developer.nokia.com/resources/library/nokia-x/nokia-notifications.html">Nokia Notification</a>
 * @since 06.09.14
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class NokiaNotificationsProvider implements NokiaPushProvider {

    private final NokiaPushProvider provider;

    public NokiaNotificationsProvider(@NonNull final Context context,
                                      @NonNull final String... sendersIds) {
        if (Build.MANUFACTURER.equals(NOKIA_MANUFACTURER)) {
            OPFLog.d("It's a Nokia device.");
            provider = new NokiaNotificationsProviderImpl(context, sendersIds);
        } else {
            OPFLog.d("It's no a Nokia device.");
            provider = new NokiaNotificationsProviderStub();
        }
    }

    public NokiaNotificationsProvider(@NonNull final Context context,
                                      @NonNull final NotificationMaker notificationMaker,
                                      @NonNull final String... sendersIds) {
        if (Build.MANUFACTURER.equals(NOKIA_MANUFACTURER)) {
            OPFLog.d("It's a Nokia device.");
            provider = new NokiaNotificationsProviderImpl(context, notificationMaker, sendersIds);
        } else {
            OPFLog.d("It's no a Nokia device.");
            provider = new NokiaNotificationsProviderStub();
        }
    }

    @Override
    public void register() {
        provider.register();
    }

    @Override
    public void unregister() {
        provider.unregister();
    }

    @NonNull
    @Override
    public AvailabilityResult getAvailabilityResult() {
        return provider.getAvailabilityResult();
    }

    @Override
    public boolean isRegistered() {
        return provider.isRegistered();
    }

    @Nullable
    @Override
    public String getRegistrationId() {
        return provider.getRegistrationId();
    }

    @NonNull
    @Override
    public String getName() {
        return provider.getName();
    }

    @Nullable
    @Override
    public String getHostAppPackage() {
        return provider.getHostAppPackage();
    }

    @NonNull
    @Override
    public NotificationMaker getNotificationMaker() {
        return provider.getNotificationMaker();
    }

    @Override
    public void checkManifest(@Nullable final CheckManifestHandler checkManifestHandler) {
        provider.checkManifest(checkManifestHandler);
    }

    @Override
    public void onRegistrationInvalid() {
        provider.onRegistrationInvalid();
    }

    @Override
    public void onUnavailable() {
        provider.onUnavailable();
    }

    @Override
    public long getRegisterOnServerLifespan() {
        return provider.getRegisterOnServerLifespan();
    }

    @Override
    public void setRegisteredOnServer(@NonNull final Context context, final boolean flag) {
        provider.setRegisteredOnServer(context, flag);
    }

    @Override
    public void setRegisterOnServerLifespan(@NonNull final Context context, final long lifespan) {
        provider.setRegisterOnServerLifespan(context, lifespan);
    }

    @Override
    public boolean isRegisterOnServer() {
        return provider.isRegisterOnServer();
    }
}
