/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch._types.mapping;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.mapping.PercolatorProperty

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/mapping/core.ts#L215-L217">API
 *      specification</a>
 */
@JsonpDeserializable
public class PercolatorProperty extends PropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	private PercolatorProperty(Builder builder) {
		super(builder);

	}

	public static PercolatorProperty of(Function<Builder, ObjectBuilder<PercolatorProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Percolator;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "percolator");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercolatorProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PercolatorProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercolatorProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercolatorProperty build() {
			_checkSingleUse();

			return new PercolatorProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercolatorProperty}
	 */
	public static final JsonpDeserializer<PercolatorProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PercolatorProperty::setupPercolatorPropertyDeserializer);

	protected static void setupPercolatorPropertyDeserializer(ObjectDeserializer<PercolatorProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);

		op.ignore("type");
	}

}