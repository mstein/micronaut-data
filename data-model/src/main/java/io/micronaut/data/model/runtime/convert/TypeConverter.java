/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.data.model.runtime.convert;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.ConversionContext;

/**
 * The type converter is used for converting mapped entity value to the persisted value and back.
 *
 * @param <X> The entity value type
 * @param <Y> The persisted value type
 *
 * @author Denis Stepanov
 * @since 3.1
 */
public interface TypeConverter<X, Y> {

    @Nullable
    Y convertToPersistedValue(@Nullable X object, @NonNull ConversionContext context);

    @Nullable
    X convertToEntityValue(@Nullable Y object, @NonNull ConversionContext context);

}
