/**
 * Copyright (c) 2002-2013 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.collections.graphdb.impl;

import java.util.Iterator;

import org.neo4j.collections.graphdb.Vertex;
import org.neo4j.graphdb.Node;

class NodeIterator implements Iterator<Vertex>{

	private final Iterator<Node> nodes;
	
	NodeIterator(Iterator<Node> nodes){
		this.nodes = nodes;
	}
	
	@Override
	public boolean hasNext() {
		return nodes.hasNext();
	}

	@Override
	public Vertex next() {
		Node node = nodes.next();
		return new VertexImpl(new GraphDatabaseImpl(node.getGraphDatabase()), node.getId());
	}

	@Override
	public void remove() {
		nodes.remove();
	}
	
}
