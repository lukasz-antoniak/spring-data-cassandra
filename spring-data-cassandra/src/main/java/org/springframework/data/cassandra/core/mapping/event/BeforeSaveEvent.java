/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.core.mapping.event;

import com.datastax.driver.core.Statement;
import org.springframework.lang.Nullable;

/**
 * Event thrown before a single row has been inserted.
 *
 * @author Lukasz Antoniak
 */
public class BeforeSaveEvent<E> extends AbstractStatementAwareMappingEvent<E> {
	private static final long serialVersionUID = 1L;

	public BeforeSaveEvent(E source, @Nullable String table, Statement statement) {
		super(source, table, statement);
	}
}