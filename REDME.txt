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

In order to try it, first build it and deploy it in your local Maven repo

> mvn clean install

Next, generate a new Maven project from the archetype

> mvn archetype:generate -DarchetypeArtifactId=my-cmis-server-archetype -DarchetypeGroupId=org.apache.chemistry.opencmis.server -DarchetypeVersion=0.1.0-incubating-SNAPSHOT

For any other information, please refer to the following page

http://incubator.apache.org/chemistry/how-to-build-a-server.html
