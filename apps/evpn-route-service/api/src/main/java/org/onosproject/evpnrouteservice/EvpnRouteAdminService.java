/*
 * Copyright 2017-present Open Networking Foundation
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

package org.onosproject.evpnrouteservice;

import java.util.Collection;

/**
 * Service allowing mutation of EVPN routing state.
 */
public interface EvpnRouteAdminService extends EvpnRouteService {

    /**
     * Updates the given routes in the route service.
     *
     * @param routes collection of routes to update
     */
    void update(Collection<EvpnRoute> routes);

    /**
     * Withdraws the given routes from the route service.
     *
     * @param routes collection of routes to withdraw
     */
    void withdraw(Collection<EvpnRoute> routes);
}
