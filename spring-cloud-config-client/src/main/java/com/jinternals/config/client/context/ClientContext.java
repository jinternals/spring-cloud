/* 
 * Copyright 2014-2015 JInternals. http://jinternals.com/ 
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
package com.jinternals.config.client.context;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jinternals.config.client.config.DBConfig;

@Configuration
@ComponentScan({ "com.jinternals.config.client.component" })
public class ClientContext {

	@Bean
	@RefreshScope
	DBConfig getTestConfig() {
		return new DBConfig();
	}

}
