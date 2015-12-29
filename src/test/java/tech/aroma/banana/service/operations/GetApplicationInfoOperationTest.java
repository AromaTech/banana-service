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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import tech.aroma.banana.thrift.exceptions.InvalidArgumentException;
import tech.aroma.banana.thrift.service.GetApplicationInfoRequest;
import tech.aroma.banana.thrift.service.GetApplicationInfoResponse;
import tech.sirwellington.alchemy.test.junit.runners.AlchemyTestRunner;
import tech.sirwellington.alchemy.test.junit.runners.GeneratePojo;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static tech.sirwellington.alchemy.test.junit.ThrowableAssertion.assertThrows;


/**
 *
 * @author SirWellington
 */
@RunWith(AlchemyTestRunner.class)
public class GetApplicationInfoOperationTest 
{
    @GeneratePojo
    private GetApplicationInfoRequest request;
    
    private GetApplicationInfoOperation instance;

    @Before
    public void setUp()
    {
        instance = new GetApplicationInfoOperation();
    }

    @Test
    public void testProcess() throws Exception
    {
        GetApplicationInfoResponse response = instance.process(request);
        assertThat(response, notNullValue());
        
    }
    
    @Test
    public void testProcessWithBadRequest()
    {
        assertThrows(() -> instance.process(null))
            .isInstanceOf(InvalidArgumentException.class);
    }

}