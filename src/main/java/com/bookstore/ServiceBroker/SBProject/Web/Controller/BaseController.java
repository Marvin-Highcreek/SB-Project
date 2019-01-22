/*
 * Copyright 2002-2018 the original author or authors.
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

package com.bookstore.ServiceBroker.SBProject.Web.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

public class BaseController {
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Map<String, String>> badBookStoreId(IllegalArgumentException e) {
		Map<String, String> responseBody = Collections.singletonMap("errorMessage", e.getMessage());
		return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
	}
}