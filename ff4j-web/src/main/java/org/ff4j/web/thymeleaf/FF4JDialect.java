package org.ff4j.web.thymeleaf;

/*
 * #%L
 * ff4j-sample-web
 * %%
 * Copyright (C) 2013 - 2016 FF4J
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

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by benoitmeriaux on 08/01/15.
 */
public class FF4JDialect extends AbstractProcessorDialect {

    public FF4JDialect() {
        // All of this dialect's attributes and/or tags
        // will start with 'ff4j:'
        //TODO: what kind of precedence?
        super("FF4JDialect", "ff4j", 10);
    }

    @Override
    public Set<IProcessor> getProcessors(final String dialectPrefix) {
        final Set<IProcessor> processors = new HashSet<IProcessor>();
        processors.add(new FF4jEnableAttrProcessor(dialectPrefix));
        processors.add(new FF4jDisableAttrProcessor(dialectPrefix));
        return processors;
    }
}
