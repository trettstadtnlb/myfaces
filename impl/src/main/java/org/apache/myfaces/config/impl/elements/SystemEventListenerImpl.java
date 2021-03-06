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
 
package org.apache.myfaces.config.impl.elements;

import java.io.Serializable;

public class SystemEventListenerImpl extends org.apache.myfaces.config.element.SystemEventListener
    implements Serializable
{
    private String systemEventListenerClass;
    private String systemEventClass;
    private String sourceClass;
    
    public void setSystemEventListenerClass(String listener)
    {
        systemEventListenerClass = listener;
    }

    public void setSystemEventClass(String event)
    {
        systemEventClass = event;
    }
    
    public void setSourceClass(String source)
    {
        sourceClass = source;
    }
    
    @Override
    public String getSystemEventListenerClass()
    {
        return systemEventListenerClass;
    }

    @Override
    public String getSystemEventClass()
    {
        return systemEventClass;
    }

    @Override
    public String getSourceClass()
    {
        return sourceClass;
    }
}
