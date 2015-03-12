/**
 * Copyright 2015 Netflix, Inc.
 *
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
 */
package com.netflix.archaius;

/**
 * Handler for property change notifications.  
 * 
 * @see {@link DefaultAppConfig} for usage example
 * 
 * @author elandau
 *
 * @param <T>
 */
public interface PropertyObserver<T> {
    /**
     * Notification that the property value changed.  next=null indicates that the property
     * has been deleted.
     * 
     * @param propName
     * @param prevValue
     * @param newValue
     */
    public void onChange(T value);
    
    /**
     * Notification that a property update failed
     * @param propName
     * @param error
     */
    public void onError(Throwable error);
}