/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
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

package com.jecelyin.editor.v2.highlight.syntax;

import com.jecelyin.editor.v2.highlight.XMLElement;

import java.util.HashMap;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */

public class MARK_PREVIOUS implements XMLElement {
    public String text;
    public String TYPE;
    public String MATCH_TYPE;
    public String AT_LINE_START;
    public String AT_WHITESPACE_END;
    public String EXCLUDE_MATCH;

    @Override
    public String tag() {
        return "MARK_PREVIOUS";
    }

    @Override
    public String text() {
        return text;
    }

    @Override
    public HashMap<String, String> attrs() {
        HashMap<String, String> map = new HashMap<>();
        map.put("TYPE", TYPE);
        map.put("AT_LINE_START", AT_LINE_START);
        map.put("MATCH_TYPE", MATCH_TYPE);
        map.put("EXCLUDE_MATCH", EXCLUDE_MATCH);
        map.put("AT_WHITESPACE_END", AT_WHITESPACE_END);

        return map;
    }

    @Override
    public XMLElement[][] children() {
        return null;
    }
}
