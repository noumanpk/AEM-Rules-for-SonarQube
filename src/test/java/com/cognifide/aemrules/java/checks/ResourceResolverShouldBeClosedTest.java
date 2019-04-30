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

import org.junit.Test;

import com.cognifide.aemrules.java.checks.resourceresolver.close.ResourceResolverShouldBeClosed;

public class ResourceResolverShouldBeClosedTest extends AbstractBaseTest {

    @Test
    public void checkInjectorNotClosedInFinallyBlock() {
        check = new ResourceResolverShouldBeClosed();
        filename = "src/test/files/checks/java/SampleServlet.java";
        verify();
    }

    @Test
    public void checkResourceResolverNotClosedInFinallyBlockWhenResourceResolverComesFromDifferentClass() {
        check = new ResourceResolverShouldBeClosed();
        filename = "src/test/files/checks/java/ResourceResolverConsumer.java";
        verifyNoIssues();
    }

    @Test
    public void checkResourceResolverNotClosedWhenItIsOpenedInActivateAndClosedInDeactivate() {
        check = new ResourceResolverShouldBeClosed();
        filename = "src/test/files/checks/java/LongSessionService.java";
        verifyNoIssues();
    }

    @Test
    public void checkResourceResolverClosedInDeactivateMethod() {
        check = new ResourceResolverShouldBeClosed();
        filename = "src/test/files/checks/java/LongSessionEventListener.java";
        verifyNoIssues();
    }

    @Test
    public void checkResourceResolverClosedInDeactivateMethodError() {
        check = new ResourceResolverShouldBeClosed();
        filename = "src/test/files/checks/java/LongResourceResolverEvenListenerError.java";
        verify();
    }

}
