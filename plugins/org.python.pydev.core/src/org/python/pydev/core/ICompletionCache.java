/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.core;

import com.aptana.shared_core.cache.Cache;

/**
 * This interface defines a behavior for a cache that can be used to store info collected during a code-completion
 * operation (or other related operations) 
 *
 * @author Fabio
 */
public interface ICompletionCache extends Cache<Object, Object> {

}
