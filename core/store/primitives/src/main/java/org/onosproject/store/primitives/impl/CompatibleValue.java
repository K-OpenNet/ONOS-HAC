/*
 * Copyright 2018-present Open Networking Foundation
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
package org.onosproject.store.primitives.impl;

import org.onosproject.core.Version;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Compatibility wrapper for primitive values.
 */
public class CompatibleValue<T> {
    private final T value;
    private final Version version;

    public CompatibleValue(T value, Version version) {
        this.value = value;
        this.version = version;
    }

    /**
     * Returns the wrapped value.
     *
     * @return the wrapped value
     */
    public T value() {
        return value;
    }

    /**
     * Returns the compatibilty version.
     *
     * @return the compatibility version
     */
    public Version version() {
        return version;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("value", value)
            .add("version", version)
            .toString();
    }
}
