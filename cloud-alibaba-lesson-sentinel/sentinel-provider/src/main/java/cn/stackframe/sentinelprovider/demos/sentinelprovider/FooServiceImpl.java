/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stackframe.sentinelprovider.demos.sentinelprovider;

import com.alibaba.cloud.demo.sentinel.api.FooService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Eric Zhao
 */
@Service
public class FooServiceImpl implements FooService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public long getCurrentTime(boolean slow) {
        // Simulate slow invocations randomly.
        if (slow) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }
        return System.currentTimeMillis();
    }
}
