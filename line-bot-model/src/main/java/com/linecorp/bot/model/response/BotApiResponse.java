/*
 * Copyright 2018 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.bot.model.response;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

/**
 * Generic response object for LINE Messaging API.
 */
@Value
public class BotApiResponse {
    private final String message;
    private final List<String> details;

    public BotApiResponse(
            @JsonProperty("message") String message,
            @JsonProperty("details") List<String> details
    ) {
        this.message = message;
        this.details = details == null ? Collections.emptyList() : details;
    }
}
