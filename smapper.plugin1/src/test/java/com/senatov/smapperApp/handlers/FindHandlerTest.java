/*******************************************************************************
 * Copyright (c) 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * JDK: JDK 1.8_51
 * @author Iakov
 * DATE: 11.08.2015 11:53:22 2015
 * PRJ: com.senatov.smapperApp
 * PACKAGE: com.senatov.smapperApp.handlers
 * FILE: FindHandlerTest.java
 */
package com.senatov.smapperApp.handlers;



import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * The Class FindHandlerTest.
 */
public class FindHandlerTest {

	@Inject
	private static org.eclipse.e4.core.services.log.Logger LOG;


	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LOG.debug(" setUpBeforeClass() ");
		assertTrue("Not yet implemented", true);
	}


	/**
	 * Tear down after class.merely a placeholder
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// merely a placeholder
		assertTrue("Not yet implemented", true);
	}


	/**
	 * Sets the up. merely a placeholder
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		// merely a placeholder
		assertTrue("Not yet implemented", true);
	}


	/**
	 * Tear down.merely a placeholder
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		// merely a placeholder
		assertTrue("Not yet implemented", true);
	}


	/**
	 * Test execute. merely a placeholder
	 */
	@Test
	public void testExecute() {
		assertTrue("Not yet implemented", true);
	}

}
