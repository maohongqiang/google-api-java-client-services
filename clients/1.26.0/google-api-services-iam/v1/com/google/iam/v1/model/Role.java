/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.iam.v1.model;

/**
 * A role in the Identity and Access Management API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Role extends com.google.api.client.json.GenericJson {

  /**
   * The current deleted state of the role. This field is read only. It will be ignored in calls to
   * CreateRole and UpdateRole.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleted;

  /**
   * Optional.  A human-readable description for the role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Used to perform a consistent read-modify-write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The names of the permissions this role grants when bound in an IAM policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includedPermissions;

  /**
   * The name of the role.
   *
   * When Role is used in CreateRole, the role name must not be set.
   *
   * When Role is used in output and other input such as UpdateRole, the role name is the complete
   * path, e.g., roles/logging.viewer for curated roles and
   * organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role,
   * the `stage` field will not be included in the returned definition for the role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stage;

  /**
   * Optional.  A human-readable title for the role.  Typically this is limited to 100 UTF-8 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The current deleted state of the role. This field is read only. It will be ignored in calls to
   * CreateRole and UpdateRole.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleted() {
    return deleted;
  }

  /**
   * The current deleted state of the role. This field is read only. It will be ignored in calls to
   * CreateRole and UpdateRole.
   * @param deleted deleted or {@code null} for none
   */
  public Role setDeleted(java.lang.Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Optional.  A human-readable description for the role.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional.  A human-readable description for the role.
   * @param description description or {@code null} for none
   */
  public Role setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Used to perform a consistent read-modify-write.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Used to perform a consistent read-modify-write.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * Used to perform a consistent read-modify-write.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public Role setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Used to perform a consistent read-modify-write.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Role encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * The names of the permissions this role grants when bound in an IAM policy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludedPermissions() {
    return includedPermissions;
  }

  /**
   * The names of the permissions this role grants when bound in an IAM policy.
   * @param includedPermissions includedPermissions or {@code null} for none
   */
  public Role setIncludedPermissions(java.util.List<java.lang.String> includedPermissions) {
    this.includedPermissions = includedPermissions;
    return this;
  }

  /**
   * The name of the role.
   *
   * When Role is used in CreateRole, the role name must not be set.
   *
   * When Role is used in output and other input such as UpdateRole, the role name is the complete
   * path, e.g., roles/logging.viewer for curated roles and
   * organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the role.
   *
   * When Role is used in CreateRole, the role name must not be set.
   *
   * When Role is used in output and other input such as UpdateRole, the role name is the complete
   * path, e.g., roles/logging.viewer for curated roles and
   * organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
   * @param name name or {@code null} for none
   */
  public Role setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role,
   * the `stage` field will not be included in the returned definition for the role.
   * @return value or {@code null} for none
   */
  public java.lang.String getStage() {
    return stage;
  }

  /**
   * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role,
   * the `stage` field will not be included in the returned definition for the role.
   * @param stage stage or {@code null} for none
   */
  public Role setStage(java.lang.String stage) {
    this.stage = stage;
    return this;
  }

  /**
   * Optional.  A human-readable title for the role.  Typically this is limited to 100 UTF-8 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional.  A human-readable title for the role.  Typically this is limited to 100 UTF-8 bytes.
   * @param title title or {@code null} for none
   */
  public Role setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Role set(String fieldName, Object value) {
    return (Role) super.set(fieldName, value);
  }

  @Override
  public Role clone() {
    return (Role) super.clone();
  }

}
