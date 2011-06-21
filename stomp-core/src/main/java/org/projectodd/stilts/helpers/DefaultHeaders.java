/*
 * Copyright 2008-2011 Red Hat, Inc, and individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.projectodd.stilts.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.projectodd.stilts.stomp.spi.Headers;

public class DefaultHeaders extends HashMap<String, String> implements Headers {

    private static final long serialVersionUID = 1L;

    @Override
    public String get(String headerName) {
        return super.get( headerName );
    }

    public void putAll(Headers headers) {
        for (String name : headers.getHeaderNames()) {
            put( name, headers.get( name ) );
        }
    }
    
    public void remove(String headerName) {
        super.remove( headerName );
    }

    @Override
    public Set<String> getHeaderNames() {
        return keySet();
    }

    @Override
    public Headers duplicate() {
        DefaultHeaders dupe = new DefaultHeaders();
        dupe.putAll(  (Map<String,String>) this  );
        return dupe;
    }

}