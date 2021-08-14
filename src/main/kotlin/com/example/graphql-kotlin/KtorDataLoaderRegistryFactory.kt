/*
 * Copyright 2021 Expedia, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.`graphql-kotlin`

import com.expediagroup.graphql.examples.server.ktor.schema.dataloaders.BookDataLoader
import com.expediagroup.graphql.examples.server.ktor.schema.dataloaders.CourseDataLoader
import com.expediagroup.graphql.examples.server.ktor.schema.dataloaders.UniversityDataLoader
import com.expediagroup.graphql.server.execution.DataLoaderRegistryFactory
import org.dataloader.DataLoaderRegistry

/**
 * Example of how to register the various DataLoaders using [DataLoaderRegistryFactory]
 */
class KtorDataLoaderRegistryFactory : DataLoaderRegistryFactory {

    override fun generate(): DataLoaderRegistry {
        val registry = DataLoaderRegistry()
        registry.register(UniversityDataLoader.dataLoaderName, UniversityDataLoader.getDataLoader())
        registry.register(CourseDataLoader.dataLoaderName, CourseDataLoader.getDataLoader())
        registry.register(BookDataLoader.dataLoaderName, BookDataLoader.getDataLoader())
        return registry
    }
}