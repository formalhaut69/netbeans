/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.editor.lib2.highlighting;

import java.util.List;
import org.netbeans.spi.editor.highlighting.HighlightsLayer;

/**
 *
 * @author vita
 */
public interface HighlightsLayerFilter {

    public static final HighlightsLayerFilter IDENTITY = new HighlightsLayerFilter() {
        public List<? extends HighlightsLayer> filterLayers(List<? extends HighlightsLayer> layers) {
            return layers;
        }

        public @Override String toString() {
            return getClass().getName() + ".IDENTITY"; //NOI18N
        }
    };
    
    public List<? extends HighlightsLayer> filterLayers(List<? extends HighlightsLayer> layers);
    
}
