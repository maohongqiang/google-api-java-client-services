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

package com.google.api.services.spanner.v1.model;

/**
 * The request for PartitionQuery
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartitionQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value.  For
   * example, values of type `BYTES` and values of type `STRING` both appear in params as JSON
   * strings.
   *
   * In these cases, `param_types` can be used to specify the exact SQL type for some or all of the
   * SQL query parameters. See the definition of Type for more information about SQL types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Type> paramTypes;

  /**
   * Parameter names and values that bind to placeholders in the SQL string.
   *
   * A parameter placeholder consists of the `@` character followed by the parameter name (for
   * example, `@firstName`). Parameter names can contain letters, numbers, and underscores.
   *
   * Parameters can appear anywhere that a literal value is expected.  The same parameter name can
   * be used more than once, for example:
   *
   * `"WHERE id > @msg_id AND id < @msg_id + 100"`
   *
   * It is an error to execute a SQL statement with unbound parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> params;

  /**
   * Additional options that affect how many partitions are created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PartitionOptions partitionOptions;

  /**
   * The query request to generate partitions for. The request will fail if the query is not root
   * partitionable. The query plan of a root partitionable query has a single distributed union
   * operator. A distributed union operator conceptually divides one or more tables into multiple
   * splits, remotely evaluates a subquery independently on each split, and then unions all results.
   *
   * This must not contain DML commands, such as INSERT, UPDATE, or DELETE. Use ExecuteStreamingSql
   * with a PartitionedDml transaction for large, partition-friendly DML operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sql;

  /**
   * Read only snapshot transactions are supported, read/write and single use transactions are not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionSelector transaction;

  /**
   * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value.  For
   * example, values of type `BYTES` and values of type `STRING` both appear in params as JSON
   * strings.
   *
   * In these cases, `param_types` can be used to specify the exact SQL type for some or all of the
   * SQL query parameters. See the definition of Type for more information about SQL types.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Type> getParamTypes() {
    return paramTypes;
  }

  /**
   * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value.  For
   * example, values of type `BYTES` and values of type `STRING` both appear in params as JSON
   * strings.
   *
   * In these cases, `param_types` can be used to specify the exact SQL type for some or all of the
   * SQL query parameters. See the definition of Type for more information about SQL types.
   * @param paramTypes paramTypes or {@code null} for none
   */
  public PartitionQueryRequest setParamTypes(java.util.Map<String, Type> paramTypes) {
    this.paramTypes = paramTypes;
    return this;
  }

  /**
   * Parameter names and values that bind to placeholders in the SQL string.
   *
   * A parameter placeholder consists of the `@` character followed by the parameter name (for
   * example, `@firstName`). Parameter names can contain letters, numbers, and underscores.
   *
   * Parameters can appear anywhere that a literal value is expected.  The same parameter name can
   * be used more than once, for example:
   *
   * `"WHERE id > @msg_id AND id < @msg_id + 100"`
   *
   * It is an error to execute a SQL statement with unbound parameters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParams() {
    return params;
  }

  /**
   * Parameter names and values that bind to placeholders in the SQL string.
   *
   * A parameter placeholder consists of the `@` character followed by the parameter name (for
   * example, `@firstName`). Parameter names can contain letters, numbers, and underscores.
   *
   * Parameters can appear anywhere that a literal value is expected.  The same parameter name can
   * be used more than once, for example:
   *
   * `"WHERE id > @msg_id AND id < @msg_id + 100"`
   *
   * It is an error to execute a SQL statement with unbound parameters.
   * @param params params or {@code null} for none
   */
  public PartitionQueryRequest setParams(java.util.Map<String, java.lang.Object> params) {
    this.params = params;
    return this;
  }

  /**
   * Additional options that affect how many partitions are created.
   * @return value or {@code null} for none
   */
  public PartitionOptions getPartitionOptions() {
    return partitionOptions;
  }

  /**
   * Additional options that affect how many partitions are created.
   * @param partitionOptions partitionOptions or {@code null} for none
   */
  public PartitionQueryRequest setPartitionOptions(PartitionOptions partitionOptions) {
    this.partitionOptions = partitionOptions;
    return this;
  }

  /**
   * The query request to generate partitions for. The request will fail if the query is not root
   * partitionable. The query plan of a root partitionable query has a single distributed union
   * operator. A distributed union operator conceptually divides one or more tables into multiple
   * splits, remotely evaluates a subquery independently on each split, and then unions all results.
   *
   * This must not contain DML commands, such as INSERT, UPDATE, or DELETE. Use ExecuteStreamingSql
   * with a PartitionedDml transaction for large, partition-friendly DML operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getSql() {
    return sql;
  }

  /**
   * The query request to generate partitions for. The request will fail if the query is not root
   * partitionable. The query plan of a root partitionable query has a single distributed union
   * operator. A distributed union operator conceptually divides one or more tables into multiple
   * splits, remotely evaluates a subquery independently on each split, and then unions all results.
   *
   * This must not contain DML commands, such as INSERT, UPDATE, or DELETE. Use ExecuteStreamingSql
   * with a PartitionedDml transaction for large, partition-friendly DML operations.
   * @param sql sql or {@code null} for none
   */
  public PartitionQueryRequest setSql(java.lang.String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * Read only snapshot transactions are supported, read/write and single use transactions are not.
   * @return value or {@code null} for none
   */
  public TransactionSelector getTransaction() {
    return transaction;
  }

  /**
   * Read only snapshot transactions are supported, read/write and single use transactions are not.
   * @param transaction transaction or {@code null} for none
   */
  public PartitionQueryRequest setTransaction(TransactionSelector transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public PartitionQueryRequest set(String fieldName, Object value) {
    return (PartitionQueryRequest) super.set(fieldName, value);
  }

  @Override
  public PartitionQueryRequest clone() {
    return (PartitionQueryRequest) super.clone();
  }

}
