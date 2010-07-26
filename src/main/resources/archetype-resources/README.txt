#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

This archetype provides the developer environment to build a CMIS Server.

To get started, run the server:

mvn jetty:run

Check the following URLs

http://localhost:8080/my-cmis-server/services/DiscoveryService
http://localhost:8080/my-cmis-server/atom

To dig into the Java code, check the following classes

src/main/java/org/apache/chemistry/opencmis/server/MyCmisServiceImpl.java
src/main/java/org/apache/chemistry/opencmis/server/MyServiceFactory.java

For any other information, please refer to the following page

http://incubator.apache.org/chemistry/how-to-build-a-server.html