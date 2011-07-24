/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.collections.graphdb.impl;

import java.util.Set;

import org.neo4j.collections.graphdb.PropertyContainer;
import org.neo4j.collections.graphdb.wrappers.AutoIndexer;
import org.neo4j.collections.graphdb.wrappers.ReadableIndex;

public class AutoIndexerImpl<T extends PropertyContainer, U extends org.neo4j.graphdb.PropertyContainer> implements AutoIndexer<T>{

	private final org.neo4j.graphdb.index.AutoIndexer<U> autoIndexer;
	
	public AutoIndexerImpl(org.neo4j.graphdb.index.AutoIndexer<U> autoIndexer) {
		this.autoIndexer = autoIndexer;
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.autoIndexer.setEnabled(enabled);
		
	}

	@Override
	public boolean isEnabled() {
		return this.autoIndexer.isEnabled();
	}

	@Override
	public ReadableIndex<T> getAutoIndex() {
		return this.getAutoIndex();
	}

	@Override
	public void startAutoIndexingProperty(String propName) {
		this.startAutoIndexingProperty(propName);
	}

	@Override
	public void stopAutoIndexingProperty(String propName) {
		this.stopAutoIndexingProperty(propName);
	}

	@Override
	public Set<String> getAutoIndexedProperties() {
		return this.getAutoIndexedProperties();
	}
}
