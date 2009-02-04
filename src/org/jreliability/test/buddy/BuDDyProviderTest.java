/**
 * JReliability is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * JReliability is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Opt4J. If not, see http://www.gnu.org/licenses/. 
 */
package org.jreliability.test.buddy;

import org.jreliability.bdd.javabdd.JBDDProviderFactory;
import org.jreliability.bdd.javabdd.JBDDProviderFactory.Type;
import org.jreliability.test.AbstractBDDProviderTest;

/**
 * The {@code BuDDyProviderTest} is the {@code AbstractBDDProviderTest} for the
 * {@code BuDDy}.
 * 
 * @author lukasiewycz
 * 
 */
public class BuDDyProviderTest extends AbstractBDDProviderTest {

	/**
	 * Constructs a {@code BuDDyProviderTest}.
	 * 
	 */
	public BuDDyProviderTest() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jreliability.test.AbstractBDDProviderTest#init()
	 */
	@Override
	public void init() {
		this.factory = new JBDDProviderFactory(Type.BUDDY);
	}

}
