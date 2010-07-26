/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors:
 *     Maurizio Pillitu, Sourcesense
 */
package org.apache.chemistry.opencmis.server;

import org.apache.chemistry.opencmis.commons.impl.server.AbstractServiceFactory;
import org.apache.chemistry.opencmis.commons.server.CallContext;
import org.apache.chemistry.opencmis.commons.server.CmisService;
import org.apache.chemistry.opencmis.commons.server.CmisServiceFactory;

import java.util.Map;

public class MyServiceFactory extends AbstractServiceFactory implements CmisServiceFactory {

  @Override
  public CmisService getService(CallContext callContext) {
    return new MyCmisServiceImpl();
  }

  @Override
  public void init(Map<String, String> parameters) {

    super.init(parameters);
  }

  @Override
  public void destroy() {
    super.destroy();
  }
}
