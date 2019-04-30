/*-
 * #%L
 * AEM Rules for SonarQube
 * %%
 * Copyright (C) 2015-2018 Cognifide Limited
 * %%
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
 * #L%
 */
package com.cognifide.aemrules.tag;

public class Tags {

    public static final String AEM = "aem";

    public static final String BUG = "bug";

    public static final String PERFORMANCE = "performance";

    public static final String MULTI_THREADING = "multi-threading";

    public static final String SLICE = "slice";

    public static final String SLING_MODELS = "sling-models";

    private Tags() {
        throw new AssertionError();
    }
}
