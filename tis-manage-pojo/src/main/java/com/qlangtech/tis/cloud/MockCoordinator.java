/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qlangtech.tis.cloud;

import java.util.List;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2020/04/13
 */
public class MockCoordinator implements ITISCoordinator {
    @Override
    public <T> T unwrap() {
        return null;
    }

    @Override
    public boolean shallConnect2RemoteIncrStatusServer() {
        return false;
    }

    @Override
    public List<String> getChildren(String zkPath //, Watcher watcher
            , boolean b) {
        throw new UnsupportedOperationException("zkPath:" + zkPath);
    }

    @Override
    public void addOnReconnect(IOnReconnect onReconnect) {
    }

    @Override
    public void create(String path, byte[] data, boolean persistent, boolean sequential) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean exists(String s, boolean b) {
        return false;
    }

    @Override
    public byte[] getData(String s //, Watcher o, Stat stat
            , boolean b) {
        throw new UnsupportedOperationException();
    }
}
