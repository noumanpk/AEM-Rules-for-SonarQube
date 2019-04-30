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
package com.example;

import static org.apache.sling.servlets.resolver.internal.ServletResolverConstants.SLING_SERVLET_EXTENSIONS;

import java.io.IOException;
import javax.servlet.ServletException;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.resolver.internal.ServletResolverConstants;

@SlingServlet(methods = "GET")
@Properties({
    @Property(name = Constants.SERVICE_VENDOR, value = "Cognifide"),
    @Property(name = Constants.SERVICE_DESCRIPTION, value = "Some description"),
    @Property(name = ServletResolverConstants.SLING_SERVLET_SELECTORS, value = "selector"), // Noncompliant {{Property SLING_SERVLET_SELECTORS can be handled by @SlingServlet annotation.}}
    @Property(name = SLING_SERVLET_EXTENSIONS, value = "json"), // Noncompliant {{Property SLING_SERVLET_EXTENSIONS can be handled by @SlingServlet annotation.}}
    @Property(name = "sling.servlet.resourceTypes", value = {"sling/servlet/default"}) // Noncompliant {{Property "sling.servlet.resourceTypes" can be handled by @SlingServlet annotation.}}
})
public class SlingTestThree extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
        throws ServletException, IOException {
        //do sth
    }
}
