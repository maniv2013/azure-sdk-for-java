/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.NetworkTrace;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class NetworkTraceImpl extends WrapperImpl<NetworkTraceInner> implements NetworkTrace {
    private final AppServiceManager manager;
    NetworkTraceImpl(NetworkTraceInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public String path() {
        return this.inner().path();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}