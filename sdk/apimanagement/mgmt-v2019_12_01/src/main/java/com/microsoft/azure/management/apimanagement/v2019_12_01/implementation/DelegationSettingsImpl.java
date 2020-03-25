/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.DelegationSettings;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PortalDelegationSettings;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PortalSettingValidationKeyContract;

class DelegationSettingsImpl extends WrapperImpl<DelegationSettingsInner> implements DelegationSettings {
    private final ApiManagementManager manager;

    DelegationSettingsImpl(ApiManagementManager manager) {
        super(manager.inner().delegationSettings());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName) {
        DelegationSettingsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<PortalDelegationSettings> getAsync(String resourceGroupName, String serviceName) {
        DelegationSettingsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<PortalDelegationSettingsInner, PortalDelegationSettings>() {
            @Override
            public PortalDelegationSettings call(PortalDelegationSettingsInner inner) {
                return new PortalDelegationSettingsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String serviceName, PortalDelegationSettingsInner parameters, String ifMatch) {
        DelegationSettingsInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, parameters, ifMatch).toCompletable();
    }

    @Override
    public Observable<PortalDelegationSettings> createOrUpdateAsync(String resourceGroupName, String serviceName, PortalDelegationSettingsInner parameters) {
        DelegationSettingsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serviceName, parameters)
        .map(new Func1<PortalDelegationSettingsInner, PortalDelegationSettings>() {
            @Override
            public PortalDelegationSettings call(PortalDelegationSettingsInner inner) {
                return new PortalDelegationSettingsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PortalSettingValidationKeyContract> listSecretsAsync(String resourceGroupName, String serviceName) {
        DelegationSettingsInner client = this.inner();
        return client.listSecretsAsync(resourceGroupName, serviceName)
        .map(new Func1<PortalSettingValidationKeyContractInner, PortalSettingValidationKeyContract>() {
            @Override
            public PortalSettingValidationKeyContract call(PortalSettingValidationKeyContractInner inner) {
                return new PortalSettingValidationKeyContractImpl(inner, manager());
            }
        });
    }

}