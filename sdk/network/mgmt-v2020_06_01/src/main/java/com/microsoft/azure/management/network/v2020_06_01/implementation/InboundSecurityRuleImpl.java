/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.management.network.v2020_06_01.InboundSecurityRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.InboundSecurityRules;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;

class InboundSecurityRuleImpl extends CreatableUpdatableImpl<InboundSecurityRule, InboundSecurityRuleInner, InboundSecurityRuleImpl> implements InboundSecurityRule, InboundSecurityRule.Definition, InboundSecurityRule.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkVirtualApplianceName;
    private String ruleCollectionName;

    InboundSecurityRuleImpl(String name, NetworkManager manager) {
        super(name, new InboundSecurityRuleInner());
        this.manager = manager;
        // Set resource name
        this.ruleCollectionName = name;
        //
    }

    InboundSecurityRuleImpl(InboundSecurityRuleInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.ruleCollectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkVirtualApplianceName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkVirtualAppliances");
        this.ruleCollectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "inboundSecurityRules");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<InboundSecurityRule> createResourceAsync() {
        InboundSecurityRuleOperationsInner client = this.manager().inner().inboundSecurityRuleOperations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkVirtualApplianceName, this.ruleCollectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<InboundSecurityRule> updateResourceAsync() {
        InboundSecurityRuleOperationsInner client = this.manager().inner().inboundSecurityRuleOperations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkVirtualApplianceName, this.ruleCollectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InboundSecurityRuleInner> getInnerAsync() {
        InboundSecurityRuleOperationsInner client = this.manager().inner().inboundSecurityRuleOperations();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<InboundSecurityRules> rules() {
        return this.inner().rules();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public InboundSecurityRuleImpl withExistingNetworkVirtualAppliance(String resourceGroupName, String networkVirtualApplianceName) {
        this.resourceGroupName = resourceGroupName;
        this.networkVirtualApplianceName = networkVirtualApplianceName;
        return this;
    }

    @Override
    public InboundSecurityRuleImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public InboundSecurityRuleImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public InboundSecurityRuleImpl withRules(List<InboundSecurityRules> rules) {
        this.inner().withRules(rules);
        return this;
    }

}
