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
package com.cognifide.aemrules.java.checks;

import com.cognifide.aemrules.java.checks.slice.session.ModelsShouldNotUseSessionCheck;
import org.junit.Rule;
import org.junit.Test;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

/**
 * @author Krzysztof Watral
 */
public class ModelsShouldNotUseSessionTest extends AbstractBaseTest {

    @Rule
    public CheckMessagesVerifierRule checkMessagesVerifier = new CheckMessagesVerifierRule();

    @Test
    public void check() {
        check = new ModelsShouldNotUseSessionCheck();
        filename = "src/test/files/checks/java/session/SampleModel.java";
        verify();
    }

    @Test
    public void checkPrivateMethodUsage() {
        check = new ModelsShouldNotUseSessionCheck();
        filename = "src/test/files/checks/java/session/ModelWithSessionLeak.java";
        verify();
    }

    @Test
    public void checkAnonymousClassUsage() {
        check = new ModelsShouldNotUseSessionCheck();
        filename = "src/test/files/checks/java/session/ModelWithAnonymousClass.java";
        verify();
    }

    @Test
    public void checkModelWithMethodCircularDependency() {
        check = new ModelsShouldNotUseSessionCheck();
        filename = "src/test/files/checks/java/session/ModelWithMethodCircularDependency.java";
        verify();
    }
}
