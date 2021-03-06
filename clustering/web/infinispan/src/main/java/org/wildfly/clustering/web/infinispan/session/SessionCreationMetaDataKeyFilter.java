/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
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

package org.wildfly.clustering.web.infinispan.session;

import java.io.Serializable;
import java.util.function.Predicate;

import org.infinispan.filter.KeyFilter;

/**
 * Filters a cache for session creation meta data entries.
 * @author Paul Ferraro
 */
public class SessionCreationMetaDataKeyFilter implements KeyFilter<Object>, Predicate<Object>, Serializable {
    private static final long serialVersionUID = -1079989480899595045L;

    @Override
    public boolean accept(Object key) {
        return key instanceof SessionCreationMetaDataKey;
    }

    @Override
    public boolean test(Object key) {
        return this.accept(key);
    }
}
