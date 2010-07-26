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

import org.apache.chemistry.opencmis.commons.data.*;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinition;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinitionContainer;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinitionList;
import org.apache.chemistry.opencmis.commons.enums.*;
import org.apache.chemistry.opencmis.commons.impl.dataobjects.AclCapabilitiesDataImpl;
import org.apache.chemistry.opencmis.commons.impl.dataobjects.RepositoryCapabilitiesImpl;
import org.apache.chemistry.opencmis.commons.impl.dataobjects.RepositoryInfoImpl;
import org.apache.chemistry.opencmis.commons.server.CmisService;
import org.apache.chemistry.opencmis.commons.server.ObjectInfo;
import org.apache.chemistry.opencmis.commons.spi.Holder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MyCmisServiceImpl implements CmisService {

  private static final String MY_REPOSITORY_ID = "my-repo-id";
  private static final String MY_ROOT_FOLDER_ID = "my-root-folder-id";
  private static final String MY_REPOSITORY_NAME = "My CMIS Repository";
  private static final String MY_REPOSITORY_DESCRIPTION = "My CMIS Description";
  private static final String MY_CMIS_VERSION_SUPPORTED = "1.0";
  private static final String MY_PRINCIPAL_ANONYMOUS = "anonymous";
  private static final String MY_PRINCIPAL_ANYONE = "anyone";
  private static final String MY_VENDOR_NAME = "My Vendor Name";
  private static final String MY_PRODUCT_NAME = "My Product Name";
  private static final String MY_PRODUCT_VERSION = "My Product Version";

  public List<RepositoryInfo> getRepositoryInfos(ExtensionsData extensionsData) {
    List<RepositoryInfo> ret = new ArrayList<RepositoryInfo>();
    ret.add(getRepositoryInfo(MY_REPOSITORY_ID, extensionsData));
    return ret;
  }

  public RepositoryInfo getRepositoryInfo(String repositoryId, ExtensionsData extensionsData) {
    RepositoryInfoImpl repoInfo = new RepositoryInfoImpl();
    repoInfo.setRepositoryId(repositoryId);
    repoInfo.setRepositoryName(MY_REPOSITORY_NAME);
    repoInfo.setRepositoryDescription(MY_REPOSITORY_DESCRIPTION);
    repoInfo.setCmisVersionSupported(MY_CMIS_VERSION_SUPPORTED);
    repoInfo.setRepositoryCapabilities(null);
    repoInfo.setRootFolder(MY_ROOT_FOLDER_ID);
    repoInfo.setPrincipalAnonymous(MY_PRINCIPAL_ANONYMOUS);
    repoInfo.setPrincipalAnyone(MY_PRINCIPAL_ANYONE);
    repoInfo.setThinClientUri(null);
    repoInfo.setChangesIncomplete(Boolean.TRUE);
    repoInfo.setChangesOnType(null);
    repoInfo.setLatestChangeLogToken(null);
    repoInfo.setVendorName(MY_VENDOR_NAME);
    repoInfo.setProductName(MY_PRODUCT_NAME);
    repoInfo.setProductVersion(MY_PRODUCT_VERSION);

    // set capabilities
    RepositoryCapabilitiesImpl caps = new
        RepositoryCapabilitiesImpl();
    caps.setAllVersionsSearchable(false);
    caps.setCapabilityAcl(CapabilityAcl.NONE);
    caps.setCapabilityChanges(CapabilityChanges.PROPERTIES);

    caps.setCapabilityContentStreamUpdates(
        CapabilityContentStreamUpdates.PWCONLY);
    caps.setCapabilityJoin(CapabilityJoin.NONE);
    caps.setCapabilityQuery(CapabilityQuery.METADATAONLY);
    caps.setCapabilityRendition(CapabilityRenditions.NONE);
    caps.setIsPwcSearchable(false);
    caps.setIsPwcUpdatable(true);
    caps.setSupportsGetDescendants(true);
    caps.setSupportsGetFolderTree(true);
    caps.setSupportsMultifiling(true);
    caps.setSupportsUnfiling(true);
    caps.setSupportsVersionSpecificFiling(false);
        repoInfo.setRepositoryCapabilities(caps);

    AclCapabilitiesDataImpl aclCaps = new AclCapabilitiesDataImpl();
    aclCaps.setAclPropagation(AclPropagation.REPOSITORYDETERMINED);
    aclCaps.setPermissionDefinitionData(null);
    aclCaps.setPermissionMappingData(null);
    repoInfo.setAclCapabilities(aclCaps);
    repoInfo.setAclCapabilities(aclCaps);
    return repoInfo;
  }

  public String create(String s, Properties properties, String s1, ContentStream contentStream, VersioningState versioningState, List<String> strings, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void deleteObjectOrCancelCheckOut(String s, String s1, Boolean aBoolean, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public Acl applyAcl(String s, String s1, Acl acl, AclPropagation aclPropagation) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectInfo getObjectInfo(String s, String s1) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void close() {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void applyPolicy(String s, String s1, String s2, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void removePolicy(String s, String s1, String s2, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<ObjectData> getAppliedPolicies(String s, String s1, String s2, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void checkOut(String s, Holder<String> stringHolder, ExtensionsData extensionsData, Holder<Boolean> booleanHolder) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void cancelCheckOut(String s, String s1, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void checkIn(String s, Holder<String> stringHolder, Boolean aBoolean, Properties properties, ContentStream contentStream, String s1, List<String> strings, Acl acl, Acl acl1, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectData getObjectOfLatestVersion(String s, String s1, String s2, Boolean aBoolean, String s3, Boolean aBoolean1, IncludeRelationships includeRelationships, String s4, Boolean aBoolean2, Boolean aBoolean3, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public Properties getPropertiesOfLatestVersion(String s, String s1, String s2, Boolean aBoolean, String s3, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<ObjectData> getAllVersions(String s, String s1, String s2, String s3, Boolean aBoolean, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void addObjectToFolder(String s, String s1, String s2, Boolean aBoolean, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void removeObjectFromFolder(String s, String s1, String s2, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public String createDocument(String s, Properties properties, String s1, ContentStream contentStream, VersioningState versioningState, List<String> strings, Acl acl, Acl acl1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public String createDocumentFromSource(String s, String s1, Properties properties, String s2, VersioningState versioningState, List<String> strings, Acl acl, Acl acl1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public String createFolder(String s, Properties properties, String s1, List<String> strings, Acl acl, Acl acl1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public String createRelationship(String s, Properties properties, List<String> strings, Acl acl, Acl acl1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public String createPolicy(String s, Properties properties, String s1, List<String> strings, Acl acl, Acl acl1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public AllowableActions getAllowableActions(String s, String s1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectData getObject(String s, String s1, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, Boolean aBoolean2, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public Properties getProperties(String s, String s1, String s2, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<RenditionData> getRenditions(String s, String s1, String s2, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectData getObjectByPath(String s, String s1, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, Boolean aBoolean2, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ContentStream getContentStream(String s, String s1, String s2, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void updateProperties(String s, Holder<String> stringHolder, Holder<String> stringHolder1, Properties properties, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void moveObject(String s, Holder<String> stringHolder, String s1, String s2, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void deleteObject(String s, String s1, Boolean aBoolean, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public FailedToDeleteData deleteTree(String s, String s1, Boolean aBoolean, UnfileObject unfileObject, Boolean aBoolean1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public void setContentStream(String s, Holder<String> stringHolder, Boolean aBoolean, Holder<String> stringHolder1, ContentStream contentStream, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public void deleteContentStream(String s, Holder<String> stringHolder, Holder<String> stringHolder1, ExtensionsData extensionsData) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  public Acl getAcl(String s, String s1, Boolean aBoolean, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public Acl applyAcl(String s, String s1, Acl acl, Acl acl1, AclPropagation aclPropagation, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectList query(String s, String s1, Boolean aBoolean, Boolean aBoolean1, IncludeRelationships includeRelationships, String s2, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectList getContentChanges(String s, Holder<String> stringHolder, Boolean aBoolean, String s1, Boolean aBoolean1, Boolean aBoolean2, BigInteger bigInteger, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectList getObjectRelationships(String s, String s1, Boolean aBoolean, RelationshipDirection relationshipDirection, String s2, String s3, Boolean aBoolean1, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectInFolderList getChildren(String s, String s1, String s2, String s3, Boolean aBoolean, IncludeRelationships includeRelationships, String s4, Boolean aBoolean1, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<ObjectInFolderContainer> getDescendants(String s, String s1, BigInteger bigInteger, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<ObjectInFolderContainer> getFolderTree(String s, String s1, BigInteger bigInteger, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<ObjectParentData> getObjectParents(String s, String s1, String s2, Boolean aBoolean, IncludeRelationships includeRelationships, String s3, Boolean aBoolean1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectData getFolderParent(String s, String s1, String s2, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public ObjectList getCheckedOutDocs(String s, String s1, String s2, String s3, Boolean aBoolean, IncludeRelationships includeRelationships, String s4, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public TypeDefinitionList getTypeChildren(String s, String s1, Boolean aBoolean, BigInteger bigInteger, BigInteger bigInteger1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public List<TypeDefinitionContainer> getTypeDescendants(String s, String s1, BigInteger bigInteger, Boolean aBoolean, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  public TypeDefinition getTypeDefinition(String s, String s1, ExtensionsData extensionsData) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }
}