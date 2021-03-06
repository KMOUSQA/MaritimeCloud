/* Copyright (c) 2011 Danish Maritime Authority.
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
package net.maritimecloud.mms.server.security;

/**
 * Interface to be implemented by authentication security handler classes
 */
public interface AuthenticationHandler extends BaseSecurityHandler {

    String SECURITY_CONF_GROUP = "authentication-conf";

    /**
     * Authenticate the user with the given authentication token
     * @param token the authentication token
     * @throws AuthenticationException if the authentication fails
     */
    void authenticate(AuthenticationToken token) throws AuthenticationException;

}
