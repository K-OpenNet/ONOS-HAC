/*
 * Copyright 2015-present Open Networking Foundation
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
package org.onosproject.vtnrsc;

import org.onlab.util.Identifier;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Immutable representation of a tenant identifier.
 */
public final class TenantId extends Identifier<String> {
    // Public construction is prohibited
    private TenantId(String tenantId) {
        super(tenantId);
    }

    /**
     * Creates a network id using the tenantid.
     *
     * @param tenantid network String
     * @return TenantId
     */
    public static TenantId tenantId(String tenantid) {
        checkNotNull(tenantid, "Tenant id can not be null");
        return new TenantId(tenantid);
    }

    /**
     * Returns the tenant identifier.
     *
     * @return the tenant identifier
     */
    public String tenantId() {
        return identifier;
    }
}
