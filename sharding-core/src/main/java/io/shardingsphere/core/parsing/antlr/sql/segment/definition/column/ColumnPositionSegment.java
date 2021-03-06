/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core.parsing.antlr.sql.segment.definition.column;

import com.google.common.base.Optional;
import io.shardingsphere.core.parsing.antlr.sql.segment.SQLSegment;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Column position segment.
 * 
 * @author duhongjun
 */
@RequiredArgsConstructor
@Getter
@Setter
public final class ColumnPositionSegment implements SQLSegment, Comparable<ColumnPositionSegment> {
    
    private final int startIndex;
    
    private final String columnName;
    
    private String afterColumnName;
    
    /**
     * Get after column name.
     * 
     * @return after column name
     */
    public Optional<String> getAfterColumnName() {
        return Optional.fromNullable(afterColumnName);
    }
    
    @Override
    public int compareTo(final ColumnPositionSegment o) {
        return startIndex - o.startIndex;
    }
}
