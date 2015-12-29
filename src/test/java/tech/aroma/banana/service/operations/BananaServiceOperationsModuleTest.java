/*
 * Copyright 2015 Aroma Tech.
 *
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
 */

package tech.aroma.banana.service.operations;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import tech.sirwellington.alchemy.test.junit.runners.AlchemyTestRunner;


/**
 *
 * @author SirWellington
 */
@RunWith(AlchemyTestRunner.class)
public class BananaServiceOperationsModuleTest 
{
    private BananaServiceOperationsModule instance;

    @Before
    public void setUp()
    {
        instance = new BananaServiceOperationsModule();
    }

    @Test
    public void testConfigure()
    {
        Guice.createInjector(instance);
    }

}